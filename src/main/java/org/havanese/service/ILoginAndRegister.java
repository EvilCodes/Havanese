package org.havanese.service;

import org.havanese.pojo.User;

/**
 * Created by Administrator on 2019/3/1 0001.
 */
public interface ILoginAndRegister {


    boolean register(User user);

    boolean login();


}
