package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		
		/* 스프링에게 지시하는 방법으로 코드 변경
		Exam exam = new NewlecExam(); 
		ExamConsole console = new GridExamConsole();
		
		console.setExam(exam);
		*/
		
		//xml파일을 참조해 IoC 컨테이너를 만듦
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		//id로 객체를 꺼내올수 있음
		//ExamConsole console = (ExamConsole) context.getBean("console");
		
		Exam exam = context.getBean(Exam.class);
		System.out.println(exam.toString());
		
		//ExamConsole의 인터페이스에맞는 class로 가져올수 있음
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
	}

}
