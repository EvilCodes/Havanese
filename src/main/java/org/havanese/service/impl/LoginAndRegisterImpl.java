package org.havanese.service.impl;

import org.havanese.pojo.User;
import org.havanese.service.ILoginAndRegister;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/3/2 0002.
 *
 */
@Service
public class LoginAndRegisterImpl implements ILoginAndRegister{
    @Override
    public boolean register(User user) {
        return false;
    }

    @Override
    public boolean login(User user) {
        return false;
    }
}
