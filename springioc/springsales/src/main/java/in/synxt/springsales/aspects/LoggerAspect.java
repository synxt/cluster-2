package in.synxt.springsales.aspects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
	private Logger logger = LogManager.getLogger("in.synxt.springsales");
	@Around("@annotation(in.synxt.springsales.aspects.Loggable)")	
	public Object logEntraceAndExit(ProceedingJoinPoint jp) throws Throwable {
		logger.trace(jp.getTarget().getClass()+"."+jp.getSignature().getName()+" Started");
		Object obj  = jp.proceed(jp.getArgs());
		logger.trace(jp.getTarget().getClass()+"."+jp.getSignature().getName()+" Ended");
		return obj;
	}
}
