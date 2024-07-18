package webApp.service;


import org.springframework.stereotype.Service;
import webApp.model.User;

import java.util.List;


public interface UserService {
    void add(User user);
    void delete(User user);
    void update(User user);
    List<User> listUsers();
    User findById(long id);
}
