package com.ys.bootlaunch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    private ModelAndView mv= new ModelAndView();


    @RequestMapping("/index")
    public ModelAndView index() {
        mv.setViewName("index");
        return mv;

    }
}
