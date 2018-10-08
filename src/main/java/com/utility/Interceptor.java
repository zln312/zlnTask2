package com.utility;


import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class Interceptor {

    static Logger logger = Logger.getLogger(Interceptor.class);


    //
    @Around("execution(* com.controller.JsonTest.*(..)))")
    public Object aroud(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
//        joinPoint.getArgs()代表取得joinPoint（即目标方法）的入参
        Object object = joinPoint.proceed();
        long cost = System.currentTimeMillis() - start;
        logger.info(joinPoint.getSignature() + "——方法用时——" + cost+"毫秒");
        return object;
    }




}
