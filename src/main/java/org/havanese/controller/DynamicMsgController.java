package org.havanese.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/12/14 0014.
 */
@Controller
@RequestMapping("havanese/common")
public class DynamicMsgController {
    @RequestMapping("dynamic")
    private String goToCurrentPage(){
        return "jie/dynamic";
    }

    @RequestMapping("loginedDynamic")
    private String goToLoginedCurrent(){
        return "jie/logined/dynamic";
    }

}
