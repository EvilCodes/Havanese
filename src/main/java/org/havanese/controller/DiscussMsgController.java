package org.havanese.controller;

import org.havanese.util.SubPageJumping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/12/14 0014.
 */
@Controller
@RequestMapping("havanese/common")
public class DiscussMsgController {
    private static final String BASE_DESC = "discuss";
    private String pathDesc = null;
    @RequestMapping("discuss")
    private String goToCurrentPage(){
        return "jie/discuss";
    }

    @RequestMapping("loginedDiscuss")
    private String goToLoginedCurrentPage(){
        return "jie/logined/discuss";
    }

    @RequestMapping("loginedDiscuss/essence")
    private String goToLoginedEssencePage(){
        pathDesc = SubPageJumping.essencePageDesc(BASE_DESC,true);
        return pathDesc;
    }

    @RequestMapping("loginedDiscuss/payamount")
    private String goToLoginedPayamountPage(){
        pathDesc = SubPageJumping.payamountPageDesc(BASE_DESC,true);
        return pathDesc;
    }
    @RequestMapping("loginedDiscuss/synthesis")
    private String goToLoginedSynthesisPage(){
        pathDesc = SubPageJumping.synthesisPageDesc(BASE_DESC,true);
        return pathDesc;
    }
    @RequestMapping("loginedDiscuss/unliquidated")
    private String goToLoginedUnliquidatedPage(){
        pathDesc = SubPageJumping.unliquidatedPageDesc(BASE_DESC,true);
        return pathDesc;
    }

    @RequestMapping("discuss/essence")
    private String goToEssencePage(){
        pathDesc = SubPageJumping.essencePageDesc(BASE_DESC,false);
        return pathDesc;
    }

    @RequestMapping("discuss/payamount")

    private String goToPayamountPage(){
        pathDesc = SubPageJumping.payamountPageDesc(BASE_DESC,false);
        return pathDesc;
    }
    @RequestMapping("discuss/synthesis")
    private String goToSynthesisPage(){
        pathDesc = SubPageJumping.synthesisPageDesc(BASE_DESC,false);
        return pathDesc;
    }
    @RequestMapping("discuss/unliquidated")
    private String goToUnliquidatedPage(){
        pathDesc = SubPageJumping.unliquidatedPageDesc(BASE_DESC,false);
        return pathDesc;
    }

}
