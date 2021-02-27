package fr.ayoub.demo.demo.dao.impl;

import fr.ayoub.demo.demo.Util.RandomUtils;
import fr.ayoub.demo.demo.dao.UserDao;
import fr.ayoub.demo.demo.model.User;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class UserDaoImpl implements UserDao {

    private static List<User> inMemoryUsers = Arrays.asList(
            new User("Adem", RandomUtils.getRandomLong()),
            new User("Ayoub", RandomUtils.getRandomLong()),
            new User("Amin", RandomUtils.getRandomLong())
    );

    public List<User> getUsers(){
        return inMemoryUsers;
    }
}
