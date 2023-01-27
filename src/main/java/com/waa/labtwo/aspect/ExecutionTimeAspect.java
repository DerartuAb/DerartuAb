package com.waa.labtwo.aspect;

import com.waa.labtwo.entity.Exception;
import com.waa.labtwo.entity.Logger;
import com.waa.labtwo.repo.ExceptionRepo;
import com.waa.labtwo.repo.LoggerRepo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
@Aspect
public class ExecutionTimeAspect {
    @Autowired
    private LoggerRepo loggerRepo;
    @Autowired
    private  ExceptionRepo exceptionRepo;


    @Pointcut("@annotation(com.waa.labtwo.aspect.ExecutionTime)")
    public void executionTimeAnnotation(){

    }
    @Around("executionTimeAnnotation()")

    public Object calculateExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        long start= System.nanoTime();
        var result= proceedingJoinPoint.proceed();
        long finish= System.nanoTime();
        System.out.println(proceedingJoinPoint.getSignature().getName()+ " It takes:" + (finish-start));
        Logger a = new Logger();
        a.setDate(LocalDate.now());
        a.setTime(LocalTime.now());
        a.setPrinciple("Derartu");
        a.setOperation("READ");
        loggerRepo.save(a);
        return result;
    }
    @AfterThrowing(value = "executionTimeAnnotation()", throwing = "exception")

    public void saveException(JoinPoint joinPoint, Throwable exception) throws Throwable{
       // var result= joinPoint.getSignature().getName();
        Exception a = new Exception();
        a.setDate(LocalDate.now());
        a.setTime(LocalTime.now());
        a.setPrinciple("Derartu");
        a.setOperation("READ");
        a.setExceptionType(exception.getMessage());
        exceptionRepo.save(a);
    }
}
