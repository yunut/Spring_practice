package spring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LogBeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		
		// method Ÿ���� ������ �ִ� �޼ҵ� ȣ���Ҷ� ���
		// target Ÿ�Ͽ����� ��ü�� ���������� ���
		System.out.println("�տ��� ����� ����");
		
		
	}

}
