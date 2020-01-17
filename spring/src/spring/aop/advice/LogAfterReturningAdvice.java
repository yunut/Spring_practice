package spring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LogAfterReturningAdvice implements AfterReturningAdvice{
	
	//함수가 호출되고난 후의 반환값으로 처리할 일을 인자로 전해받음
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("returnValue:"+ returnValue + ", method: "+ method.getName());
	}

}
