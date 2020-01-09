package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {

	private Exam exam;
	public InlineExamConsole() {
		// TODO Auto-generated constructor stub
	}

	
	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("total is %d, avg is %f\n", exam.total(),exam.avg());
	}
	
	//자동으로 객체를 연결
	@Autowired
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
