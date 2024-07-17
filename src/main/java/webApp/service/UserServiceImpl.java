package webApp.service;

import webApp.dao.UserDao;
import webApp.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao userDao;
    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
}
