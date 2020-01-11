package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {

	
	private Exam exam;
	
	public GridExamConsole() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor");
	}
	
	@Autowired(required = false)
	public GridExamConsole(@Qualifier("exam2") Exam exam) {
		this.exam = exam;
		System.out.println("overloaded constructor");
	}
	
	@Override
	public void print() {
		System.out.println("----------------------");
		System.out.println("|  total   |    avg  |");
		System.out.println("----------------------");
		System.out.printf("|  %3d    |     %3.2f |\n",exam.total(), exam.avg());
		System.out.println("----------------------");
	}


	@Override
	public void setExam(Exam exam) {
		System.out.println("setter");
		this.exam = exam;
	}

}
