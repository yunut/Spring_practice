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
		
		/* ���������� �����ϴ� ������� �ڵ� ����
		Exam exam = new NewlecExam(); 
		ExamConsole console = new GridExamConsole();
		
		console.setExam(exam);
		*/
		
		//xml������ ������ IoC �����̳ʸ� ����
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		//id�� ��ü�� �����ü� ����
		//ExamConsole console = (ExamConsole) context.getBean("console");
		
		Exam exam = context.getBean(Exam.class);
		System.out.println(exam.toString());
		
		//ExamConsole�� �������̽����´� class�� �����ü� ����
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
	}

}
