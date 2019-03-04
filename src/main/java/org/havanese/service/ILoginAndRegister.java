package org.havanese.service;

import org.havanese.dto.LoginEntity;
import org.havanese.dto.RegisterEntity;
import org.havanese.pojo.User;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by blackfox on 2019/3/1 0001.
 * @desc 登陆注册相关的接口
 */
public interface ILoginAndRegister {

    boolean register(RegisterEntity registerEntity);

    boolean login(LoginEntity loginEntity, HttpServletRequest request);



}
