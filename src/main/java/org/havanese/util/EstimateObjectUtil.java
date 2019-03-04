package org.havanese.util;

import org.havanese.dto.LoginEntity;
import org.havanese.dto.RegisterEntity;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;

/**
 * Created by Administrator on 2019/3/2 0002.
 */
public class EstimateObjectUtil {

    public static boolean estimateObject(Object object){
        Field[] fields=null;
        if (object != null) {
            fields=object.getClass().getDeclaredFields();
        }
        if (fields.length != 0 && fields != null) {
            return  true;
        }
        return false;
    }

    public static boolean verifyRegisterEntity(RegisterEntity registerEntity, HttpServletRequest request){
        String password=registerEntity.getPassword();
        String verifyCode= (String) request.getSession().getAttribute("verifycode");
        if (password.equals(registerEntity.getRepassword())&&verifyCode.equals(registerEntity.getVercode())) {
            return true;
        }
        return false;

    }

    public static boolean verifyLoginedEntity(LoginEntity loginEntity, HttpServletRequest request) {
        String verifycode=loginEntity.getVerifiedCode();
        String sourceCode= (String) request.getSession().getAttribute("verifycode");
        if (sourceCode.equals(verifycode)) {
            return true;
        }
        return false;

    }



}
