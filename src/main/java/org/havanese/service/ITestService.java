package org.havanese.service;

import org.havanese.pojo.User;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/12/8 0008.
 */

public interface ITestService {

    boolean regUser(String name,int age);

    User findUserByName(String name);

}
