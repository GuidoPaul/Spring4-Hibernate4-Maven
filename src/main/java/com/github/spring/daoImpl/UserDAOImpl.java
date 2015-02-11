package com.github.spring.daoImpl;

import com.github.spring.dao.UserDAO;
import com.github.spring.pojo.User;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author guido
 */
@Repository
@Transactional
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(User user) {
        this.sessionFactory.getCurrentSession().merge(user);
    }

    @Override
    public void delete(Integer id) {
        this.sessionFactory.getCurrentSession().
                delete(this.sessionFactory.getCurrentSession().load(User.class, id));
    }

    @Override
    public void update(User user) {
        this.sessionFactory.getCurrentSession().merge(user);
    }

    @Override
    public User find(Integer id) {
        return (User) this.sessionFactory.getCurrentSession().get(User.class, id);
    }

    @Override
    public List<User> getList(int beginIndex, int pageSize) {
        String hql = "FROM User ORDER BY id DESC";
        Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
        if (beginIndex >= 0) {
            query.setFirstResult(beginIndex);
            query.setMaxResults(pageSize);
        }
        return query.list();
    }

    @Override
    public List<User> getAllList() {
        String hql = "FROM User";
        Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
        return query.list();
    }

}
