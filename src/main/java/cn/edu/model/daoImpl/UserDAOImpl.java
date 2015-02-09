package cn.edu.model.daoImpl;

import cn.edu.model.dao.UserDAO;
import cn.edu.model.pojo.User;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author guido
 */
public class UserDAOImpl implements UserDAO {

    private SessionFactory sessionFactory;

    public UserDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public List<User> list() {
//        String hql = "FROM User";
//        Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
//        List<User> list = (List<User>)query.list();
//        return list;
        List<User> listUser = (List<User>) sessionFactory.getCurrentSession()
                .createCriteria(User.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
        return listUser;
    }

}
