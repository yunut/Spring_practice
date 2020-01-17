package spring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LogBeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		
		// method 타겟이 가지고 있는 메소드 호출할때 사용
		// target 타켓에대한 객체를 얻어오기위해 사용
		System.out.println("앞에서 실행된 로직");
		
		
	}

}
