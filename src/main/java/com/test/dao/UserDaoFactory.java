package com.test.dao;

public class UserDaoFactory {
    public UserDao awsUserDao(){
        return new UserDao(new AwsConnectionMaker());
    }
}
