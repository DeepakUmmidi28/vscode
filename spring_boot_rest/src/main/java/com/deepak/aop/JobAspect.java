package com.deepak.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class JobAspect {

    public final static Logger LOGGER=LoggerFactory.getLogger(JobAspect.class);

    @Before("execution(* com.deepak.service.jobService.*(..))")
    public void logBefore(){
        LOGGER.info("Before executing method");
    }

    @AfterReturning("execution(* com.deepak.service.jobService.*(..))")
    public void afterReturning(){
        LOGGER.info("After executing method");
    }

    @AfterThrowing("execution(* com.deepak.service.jobService.*(..))")
    public void afterThrowing(){
        LOGGER.error("Exception occurred while executing method");
    }

    @After("execution(* com.deepak.service.jobService.*(..))")
    public void after(){
        LOGGER.info("After executing method");
    }

    @Around("execution(* com.deepak.service.jobService.*(..))")
    public Object logAround(ProceedingJoinPoint jp) throws Throwable {
        long start=System.currentTimeMillis();
        Object obj=jp.proceed();
        long end=System.currentTimeMillis();
        LOGGER.info("Time taken to execute method: "+ jp.getSignature().getName() + " is " + (end - start) + " ms");
        return obj;
    }

}
