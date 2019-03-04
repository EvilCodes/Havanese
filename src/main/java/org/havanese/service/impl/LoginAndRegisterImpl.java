package org.havanese.service.impl;

import org.havanese.dto.RegisterEntity;
import org.havanese.mapper.UserMapper;
import org.havanese.pojo.User;
import org.havanese.service.ILoginAndRegister;
import org.havanese.util.EstimateObjectUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by blackfox on 2019/3/2 0002.
 * @desc 登陆注册对应的服务类
 */
@Service
public class LoginAndRegisterImpl implements ILoginAndRegister{

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean register(RegisterEntity registerEntity) {
        boolean isSuccessed=false;
        if (EstimateObjectUtil.estimateObject(registerEntity)) {
            User user=new User();
            user.setEmail(registerEntity.getEmail());
            user.setNick(registerEntity.getNick());
            user.setPassword(registerEntity.getPassword());
            user.setRegisterDate(new Date());
            isSuccessed=userMapper.insertUser(user);
        }
        return isSuccessed;
    }

    @Override
    public boolean login(User user) {
        boolean isSuccessed=false;
        if (EstimateObjectUtil.estimateObject(user)) {
            String emailAddress=user.getEmail();
            User baseUser = userMapper.findUserById(emailAddress);
            isSuccessed = EstimateObjectUtil.estimateObject(baseUser);
        }
        return isSuccessed;
    }

}
