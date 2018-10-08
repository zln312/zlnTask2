package com.controller;

import com.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MessageTest1 {

    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping(value = "/message", method = RequestMethod.GET)
    public ModelAndView test(ModelAndView modelAndView) {

        modelAndView.addObject("code", -2);
        modelAndView.setViewName("taglib");
        return modelAndView;
    }
}
