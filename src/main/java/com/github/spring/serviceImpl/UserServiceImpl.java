package com.github.spring.serviceImpl;

import com.github.spring.dao.UserDAO;
import com.github.spring.pojo.User;
import com.github.spring.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 *
 * @author guido
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    @CacheEvict(value = "userCache", key = "#user.userId")
    public void add(User user) {
        userDAO.add(user);
    }

    @Override
    @CacheEvict(value = "userCache", key = "#id")
    public void delete(Integer id) {
        userDAO.delete(id);
    }

    @Override
    @CacheEvict(value = "userCache", key = "#user.userId")
    public void update(User user) {
        userDAO.update(user);
    }

    @Override
    @Cacheable(value = "userCache", key = "#root.method.name")
    public User find(Integer id) {
        return userDAO.find(id);
    }

    @Override
    @Cacheable(value = "userCache", key = "#root.method.name")
    public List<User> getList(int beginIndex, int pageSize) {
        return userDAO.getList(beginIndex, pageSize);
    }

    @Override
    @Cacheable(value = "userCache", key = "#root.method.name")
    public List<User> getAllList() {
        return userDAO.getAllList();
    }

}
