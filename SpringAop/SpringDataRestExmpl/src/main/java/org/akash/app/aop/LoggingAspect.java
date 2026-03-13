package org.akash.app.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	
	private static final Logger logger=LoggerFactory.getLogger(LoggingAspect.class);
	
//	@Before("execution(* org.akash.app.service.JobService.*(..))")
//	public void logMethodCall() {
//		logger.info("method called");
//	}
	@Before("execution(* org.akash.app.service.JobService.getJob(..)) || execution(* org.akash.app.service.JobService.getAllJobs())")
	public void logMethodCall(JoinPoint jp) {
		logger.info("method called "+jp.getSignature().getName());
	}
	@After("execution(* org.akash.app.service.JobService.getJob(..)) || execution(* org.akash.app.service.JobService.getAllJobs())")
	public void logMethodExecuted(JoinPoint jp) {
		logger.info("method executed "+jp.getSignature().getName());
	}
	@AfterThrowing("execution(* org.akash.app.service.JobService.getJob(..)) || execution(* org.akash.app.service.JobService.getAllJobs())")
	public void logMethodCrash(JoinPoint jp) {
		logger.info("method has some issues "+jp.getSignature().getName());
	}
	@AfterReturning("execution(* org.akash.app.service.JobService.getJob(..)) || execution(* org.akash.app.service.JobService.getAllJobs())")
	public void logMethodExecutedSuccess(JoinPoint jp) {
		logger.info("method executed successfully "+jp.getSignature().getName());
	}
}
