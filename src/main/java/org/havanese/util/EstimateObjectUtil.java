package org.havanese.util;

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

}
