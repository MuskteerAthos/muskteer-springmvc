package com.muskteer.spring.proxy.spring.advice;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.ThrowsAdvice;

public class ShopExceptionAdvice implements ThrowsAdvice {
    public void afterThrowing(Method method, Object[] args, Object target,  
            Exception ex) throws Throwable  {
     // 在后台中输出错误异常异常信息，通过log4j输出。  
        Log log = LogFactory.getLog(target.getClass());  
        log.info("**************************************************************");  
        log.info("Error happened in class: " + target.getClass().getName());  
        log.info("Error happened in method: " + method.getName());  
            for (int i = 0; i < args.length; i++)  
            {  
                log.info("arg[" + i + "]: " + args[i]);  
            }  
        log.info("Exception class: " + ex.getClass().getName());  
        log.info("ex.getMessage():" + ex.getMessage());  
        ex.printStackTrace();  
        log.info("**************************************************************");  
  
    }

}
