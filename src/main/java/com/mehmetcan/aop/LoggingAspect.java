package com.mehmetcan.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class LoggingAspect {



    @Before("execution(* com.alituran.vforvic.service.concretes.*.*(..))")
    public void before(JoinPoint joinPoint) {
        log.info("metot baslamadan once" + joinPoint.getSignature().getName());
    }





    @Around("execution(* com.alituran.vforvic..*(..))")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {

        log.info("Metot basladi" + joinPoint.getSignature().getName());

        Object proceed = joinPoint.proceed();

        log.info("Metot bitti" + joinPoint.getSignature().getName());

        return proceed;

    }

}
