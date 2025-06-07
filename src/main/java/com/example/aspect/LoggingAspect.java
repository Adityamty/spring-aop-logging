package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.example.service.*.*(..))")
    public void logBeforeExecution(JoinPoint joinPoint) {
        System.out.println("Logging BEFORE method: " + joinPoint.getSignature().getName());
    }
}
