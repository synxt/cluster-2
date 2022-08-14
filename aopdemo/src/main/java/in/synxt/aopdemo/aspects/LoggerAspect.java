package in.synxt.aopdemo.aspects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
	private static Logger logger= LogManager.getLogger("in.synxt.aopdemo");
	@Around("execution(* in.synxt.aopdemo.MyBusiness.doMyBusiness(..))")
	public void firstAdvice(ProceedingJoinPoint jp) throws Throwable {
		logger.info("Before Advice");
		jp.proceed();
		logger.info("After Advice");
		logger.error("Exception",new Exception("Custom Exception"));
	}
}
