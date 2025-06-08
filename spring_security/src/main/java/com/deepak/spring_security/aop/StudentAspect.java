package com.deepak.spring_security.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StudentAspect {

    private final static Logger LOGGER=LoggerFactory.getLogger(StudentAspect.class);

    @Before("execution(* com.deepak.spring_security.*(..))")
    public void log(JoinPoint jp){
        LOGGER.info(jp.getSignature().getName()+" Method called");
    }

    @After("execution(* com.deepak.spring_security.*(..))")
    public void logAfter(JoinPoint jp){
        LOGGER.info(jp.getSignature().getName()+" Method ended");
    }

    @Around("execution(* com.deepak.spring_security.*(..))")
    public Object logAround(ProceedingJoinPoint jp) throws Throwable{
        long start=System.currentTimeMillis();
        Object obj=jp.proceed();
        long end=System.currentTimeMillis();
        LOGGER.info("Time taken to execute "+jp.getSignature().getName()+" is "+(end-start)+" ms");
        return obj;
    }

}
