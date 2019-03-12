package org.havanese.util;

/**
 * Created by blackfox on 2019/1/3 0003.
 * @Desc : 该类是一个用于返回子页面具体路径的工具类
 */
public class SubPageJumping {

    public final static String BASE_PATH_DESC = "subtabpage";

    public static String essencePageDesc(String baseDesc,boolean isLogined){
        String pathDesc=null;

        if (baseDesc != null && !baseDesc.equals("")) {
            if (!isLogined)
            pathDesc = BASE_PATH_DESC + "/" + baseDesc + "/" + "essence";
            else{
                pathDesc = BASE_PATH_DESC + "/" + "logined" + "/" + baseDesc+"/essence";
            }
        }
        return pathDesc;
    }

    public static String payamountPageDesc(String baseDesc,boolean isLogined){
        String pathDesc=null;
        if (baseDesc != null && !baseDesc.equals("")) {
            if (!isLogined){
                pathDesc = BASE_PATH_DESC + "/" +
                        baseDesc + "/" + "payamount";
            } else{
                pathDesc = BASE_PATH_DESC + "/" + "logined" + "/" + baseDesc+"/payamount";

            }

        }
        return pathDesc;

    }


    public static String synthesisPageDesc(String baseDesc,boolean isLogined){
        String pathDesc=null;
        if (baseDesc != null && !baseDesc.equals("")) {
            if (!isLogined) {
                pathDesc = BASE_PATH_DESC + "/" + baseDesc + "/" +
                        "synthesis";
            } else {
                pathDesc = BASE_PATH_DESC + "/" + "logined/" + baseDesc + "/" +"synthesis";
            }

        }
        return pathDesc;
    }


    public static String unliquidatedPageDesc(String baseDesc,boolean isLogined){
        String pathDesc=null;
        if (null != baseDesc && !"".equals(baseDesc)) {
            if (!isLogined) {
                pathDesc = BASE_PATH_DESC + "/" + baseDesc + "/" + "unliquidated";
            } else {
                pathDesc = BASE_PATH_DESC + "/" + "logined" + "/"+baseDesc + "/" +"unliquidated";
            }

        }
        return pathDesc;

    }





}
