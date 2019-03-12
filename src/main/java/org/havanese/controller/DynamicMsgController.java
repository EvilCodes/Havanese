package org.havanese.controller;

import org.havanese.util.SubPageJumping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/12/14 0014.
 */
@Controller
@RequestMapping("havanese/common")
public class DynamicMsgController {
    private static final String BASE_DESC = "dynamic";
    private String pathDesc;
    @RequestMapping("dynamic")
    private String goToCurrentPage(){
        return "jie/dynamic";
    }

    @RequestMapping("loginedDynamic")
    private String goToLoginedCurrent(){
        return "jie/logined/dynamic";
    }
    @RequestMapping("loginedDynamic/essence")
    private String goToLoginedEssencePage(){
        pathDesc = SubPageJumping.essencePageDesc(BASE_DESC,true);
        return pathDesc;
    }

    @RequestMapping("loginedDynamic/payamount")
    private String goToLoginedPayamountPage(){
        pathDesc = SubPageJumping.payamountPageDesc(BASE_DESC,true);
        return pathDesc;
    }
    @RequestMapping("loginedDynamic/synthesis")
    private String goToLoginedSynthesisPage(){
        pathDesc = SubPageJumping.synthesisPageDesc(BASE_DESC,true);
        return pathDesc;
    }
    @RequestMapping("loginedDynamic/unliquidated")
    private String goToLoginedUnliquidatedPage(){
        pathDesc = SubPageJumping.unliquidatedPageDesc(BASE_DESC,true);
        return pathDesc;
    }

    @RequestMapping("dynamic/essence")
    private String goToEssencePage(){
        pathDesc = SubPageJumping.essencePageDesc(BASE_DESC,false);
        return pathDesc;
    }

    @RequestMapping("dynamic/payamount")

    private String goToPayamountPage(){
        pathDesc = SubPageJumping.payamountPageDesc(BASE_DESC,false);
        return pathDesc;
    }
    @RequestMapping("dynamic/synthesis")
    private String goToSynthesisPage(){
        pathDesc = SubPageJumping.synthesisPageDesc(BASE_DESC,false);
        return pathDesc;
    }
    @RequestMapping("dynamic/unliquidated")
    private String goToUnliquidatedPage(){
        pathDesc = SubPageJumping.unliquidatedPageDesc(BASE_DESC,false);
        return pathDesc;
    }

}
