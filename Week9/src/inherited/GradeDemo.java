package inherited;

import javax.swing.JOptionPane;

public class GradeDemo {
	public static void main(String[] args) {
		String input;
		int questions, missed;
		
		input = JOptionPane.showInputDialog("How many questions?");
		questions = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("How many missed?");
		missed = Integer.parseInt(input);
		
		FinalExam exam = new FinalExam(questions, missed);
		
		exam.display();
		
		exam.foo();
		exam.foo2();
	}
}
