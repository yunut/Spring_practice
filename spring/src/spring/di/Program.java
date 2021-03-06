package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
		ApplicationContext context = new AnnotationConfigApplicationContext(NewlecDIConfig.class);
				
				//new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		//id로 객체를 꺼내올수 있음
		ExamConsole console = (ExamConsole) context.getBean("console");
		
		//Exam exam = context.getBean(Exam.class);
		//System.out.println(exam.toString());
		
		//ExamConsole의 인터페이스에맞는 class로 가져올수 있음
		//ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
		//이름을 통해서 가져오면 형변환
		//List<Exam> exams = (List<Exam>) context.getBean("exams"); //new ArrayList<>();
		//exams.add(new NewlecExam(1,1,1,1));
		
		//for(Exam e: exams) 
		//	System.out.println(e);
		
	}

}
