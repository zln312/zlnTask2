package com.controller;


import com.model.Student;
import com.service.StudentService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;
import java.util.List;


@Controller
public class JsonTest {
    private Logger logger = Logger.getLogger(JsonTest.class);

    @Autowired
    private StudentService studentService;

    //查询全部
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ModelAndView show(ModelAndView modelAndView) {
        List list = studentService.showAll();
        modelAndView.addObject("all", list);
        modelAndView.addObject("code", 5);
        modelAndView.setViewName("select");
        return modelAndView;
    }

    //查询单条
    @RequestMapping(value = "/test/{id}", method = RequestMethod.GET)
    public ModelAndView showOne(@PathVariable("id") Long id, ModelAndView modelAndView) throws SQLException {
        logger.info(id);
        Student student = studentService.showOneI(id);
        if (student == null) {
            modelAndView.addObject("code", -4);
        } else {
            modelAndView.addObject("data", student);
            modelAndView.addObject("code", 4);
        }
        modelAndView.addObject("student", student);
        modelAndView.setViewName("selectOne");
        return modelAndView;
    }

    //添加数据
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public ModelAndView add(Student student, ModelAndView modelAndView) throws SQLException {
        logger.info(student.toString());
        studentService.add(student);
        if (student.getId() != 0) {
            modelAndView.addObject("code", 1);
        } else {
            modelAndView.addObject("code", -1);
        }
        modelAndView.setViewName("taglib");
        return modelAndView;
    }

    //删除数据
    @RequestMapping(value = "/test/{id}", method = RequestMethod.DELETE)
    public ModelAndView delete(@PathVariable("id") Integer id, ModelAndView modelAndView) throws SQLException {
        logger.info(id);

        if (studentService.delete(id)) {
            modelAndView.addObject("code", 2);
        } else {
            modelAndView.addObject("code", -2);
        }
        modelAndView.setViewName("taglib");
        return modelAndView;
    }

    //修改数据
    @RequestMapping(value = "/test", method = RequestMethod.PUT)
    public ModelAndView update(Student student, ModelAndView modelAndView) throws SQLException {
        if (studentService.update(student)) {
            modelAndView.addObject("code", 3);
        } else {
            modelAndView.addObject("code", -3);
        }
        modelAndView.setViewName("taglib");
        return modelAndView;
    }

}
