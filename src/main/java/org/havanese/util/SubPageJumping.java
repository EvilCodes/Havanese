package org.havanese.util;

/**
 * Created by blackfox on 2019/1/3 0003.
 * @Desc : 该类是一个用于返回子页面具体路径的工具类
 */
public class SubPageJumping {

    public final static String BASE_PATH_DESC = "subtabpage";

    public static String EssencePageDesc(String baseDesc){
        String pathDesc=null;

        if (baseDesc != null && !baseDesc.equals("")) {
            pathDesc = BASE_PATH_DESC + "/" + baseDesc + "/" + "essence";
        }
        return pathDesc;
    }

    public static String payamountPageDesc(String baseDesc){
        String pathDesc=null;
        if (baseDesc != null && !baseDesc.equals("")) {
            pathDesc = BASE_PATH_DESC + "/" +
                    baseDesc + "/" + "payamount";

        }
        return pathDesc;

    }


    public static String synthesisPageDesc(String baseDesc){
        String pathDesc=null;
        if (baseDesc != null && !baseDesc.equals("")) {
            pathDesc = BASE_PATH_DESC + "/" + baseDesc + "/" +
                    "synthesis";
        }
        return pathDesc;
    }


    public static String unliquidatedPageDesc(String baseDesc){
        String pathDesc=null;
        if (null != baseDesc && !"".equals(baseDesc)) {
            pathDesc = BASE_PATH_DESC + "/" + baseDesc + "/" + "unliquidated";
        }
        return pathDesc;

    }





}
