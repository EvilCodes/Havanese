package org.havanese.service;

import org.havanese.mapper.UserMapper;
import org.havanese.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/12/8 0008.
 */
@Service
public class TestServiceImpl implements ITestService{

    @Autowired
    private UserMapper mapper;


    @Override
    public boolean regUser(String name, int age) {
        boolean regFlag;
        if (null != name && age != 0) {

            regFlag = mapper.insertUsers(name, age);

        } else {
            regFlag=false;
        }
        return regFlag;
    }

    @Override
    public User findUserByName(String name) {
        User user = mapper.findUserById(name);
        return user;
    }

}
