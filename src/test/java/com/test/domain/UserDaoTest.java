package com.test.domain;

import com.test.dao.UserDao;
import com.test.dao.UserDaoFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserDaoTest {

    @Test
    void addAndSelect(){
        UserDao userDao = new UserDaoFactory().awsUserDao();
        String id = "1";
        userDao.add(new User(id, "abc", "3344"));
        User user = userDao.findById(id);
        assertEquals("abc", user.getName());
        assertEquals("3344", user.getPassword());

    }

}