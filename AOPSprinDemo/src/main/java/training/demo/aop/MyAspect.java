package training.demo.aop;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Component
@Aspect
public class MyAspect {
	
	/*@PointCut("execution(* trainig.demo.model.*.*(..))")
	public void mypointCut() {}*/
	
	@Before("execution(* training.demo.model.Employee.calcMethod(int))")
	public void beforeAdvice() {
		System.out.println("In before advice");
		
	}
	
	@Around("execution(* training.demo.model.Employee.calcMethod(int))")
	public Object arounAdvice(ProceedingJoinPoint p) throws Throwable {
		System.out.println("In around advice beforemethod call");
		Object ob=p.proceed();
		System.out.println("In around advice After method call");
		return ob;
	}
	@After("execution(* training.demo.model.Employee.calcMethod(int))")
	public void afterAdvice()  {
		System.out.println("In after advice beforemethod call");
		
	}
	

}
