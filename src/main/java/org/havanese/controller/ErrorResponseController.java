package org.havanese.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/12/14 0014.
 */

@Controller
@RequestMapping("havanese/error")
public class ErrorResponseController {
    @RequestMapping("error-404")
    private String goToPageNotFind(){
        return "other/404";
    }

}
