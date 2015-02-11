package com.github.spring.service;

import com.github.spring.pojo.User;
import java.util.List;

/**
 *
 * @author guido
 */
public interface UserService {

    public abstract void add(User user);

    public abstract void delete(Integer id);

    public abstract void update(User user);

    public abstract User find(Integer id);

    public abstract List<User> getList(int beginIndex, int pageSize);

    public abstract List<User> getAllList();
}
