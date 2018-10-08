package com.controller;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageTest {
    public static void main(String[] args) {


        MessageSource messageSource = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        String message = messageSource.getMessage("-2", null, null);
        System.out.println(message);
    }
}
