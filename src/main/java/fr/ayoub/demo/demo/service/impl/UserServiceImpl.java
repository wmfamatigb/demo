package fr.ayoub.demo.demo.service.impl;

import fr.ayoub.demo.demo.dao.UserDao;
import fr.ayoub.demo.demo.model.User;
import fr.ayoub.demo.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

}
