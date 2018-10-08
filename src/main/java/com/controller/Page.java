package com.controller;

import com.utility.Jump;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
public class Page {
    private Logger logger=Logger.getLogger(Page.class);
    @Autowired
    private Jump jump;

    @RequestMapping(value = "students", method = RequestMethod.GET)
    public ModelAndView first(ModelAndView modelAndView) {

        List list = jump.getPageStudent(1);
        long max = jump.getPages();
        modelAndView.addObject("page", 1);
        modelAndView.addObject("students", list);
        modelAndView.addObject("max", max);
        modelAndView.setViewName("page");
        return modelAndView;
    }

    @RequestMapping(value = "student", method = RequestMethod.GET)
    public ModelAndView turn(long page, ModelAndView modelAndView) {
        long max = jump.getPages();
        if (page < 1 || page > max) {
            page = 1;
        }
        logger.info(page);
        List list = jump.getPageStudent(page);
        modelAndView.addObject("page", page);
        modelAndView.addObject("students", list);
        modelAndView.addObject("max", max);
        modelAndView.setViewName("page");
        return modelAndView;
    }
}

