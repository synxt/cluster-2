package in.synxt.springsales.aspects;

import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
	@Autowired
	private Logger logger;
	@Around("execution(* in.synxt.springsales.*.*(..))")
	public void logEntraceAndExit(ProceedingJoinPoint jp) throws Throwable {
		jp.proceed();
	}
}
