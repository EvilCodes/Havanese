package org.havanese.controller;

import org.havanese.util.VerifyCodeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by Administrator on 2019/3/1 0001.
 */
@Controller
@RequestMapping("havanese/notifyimg")
public class DynamicNotifyImageController {

    @RequestMapping("img")
    public void verifyCode(HttpServletRequest request, HttpServletResponse reponse){
        VerifyCodeUtil util=new VerifyCodeUtil();
        BufferedImage image=util.getImage();
        request.getSession().setAttribute("verifycode",util.getText());
        try {
            util.output(image,reponse.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }




}
