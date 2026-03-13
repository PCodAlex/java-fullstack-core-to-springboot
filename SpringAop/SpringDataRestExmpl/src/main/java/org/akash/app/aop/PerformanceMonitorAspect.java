package org.akash.app.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceMonitorAspect {
	private static final Logger logger=LoggerFactory.getLogger(PerformanceMonitorAspect.class);
	
	@Around("execution(* org.akash.app.service.JobService.getJob(..)) || execution(* org.akash.app.service.JobService.getAllJobs())")
	public Object monitorTime(ProceedingJoinPoint jp) throws Throwable {
		long start=System.currentTimeMillis();
		Object obj=jp.proceed();
		long end=System.currentTimeMillis();
		logger.info("Time taken : "+jp.getSignature().getName()+" : "+(end-start)+" ms");
		return obj;
	}
}
