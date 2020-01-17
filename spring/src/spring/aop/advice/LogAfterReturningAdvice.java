package spring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LogAfterReturningAdvice implements AfterReturningAdvice{
	
	//�Լ��� ȣ��ǰ� ���� ��ȯ������ ó���� ���� ���ڷ� ���ع���
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("returnValue:"+ returnValue + ", method: "+ method.getName());
	}

}
