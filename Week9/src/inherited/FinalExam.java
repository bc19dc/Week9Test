package inherited;

import javax.swing.JOptionPane;

public class FinalExam extends GradedActivity {
	private int numQuestions;
	private double pointsEach;
	private int numMissed;
	
	public int getNumQuestions() {
		return numQuestions;
	}
	public void setNumQuestions(int numQuestions) {
		this.numQuestions = numQuestions;
	}
	
	public FinalExam(int numQuestions, int numMissed) {
		this.numQuestions = numQuestions;
		this.numMissed = numMissed;
		
		pointsEach = 100.0/numQuestions;
		
		double score = 100 - (numMissed * pointsEach);
		setScore(score);
	}
	
	public void bar() {
		System.out.println(score); // available only if score is NOT private in parent
		display();
		super.display();
	}
	
	@Override
	public void display() {
		JOptionPane.showMessageDialog(
			null,
			"Each question counts " + pointsEach
		);
		super.display();
	}
	
	public static String foo() {
		String result = "BUT I can shadow it by defining the same function WITHOUT @Override!";
		
		return GradedActivity.foo() + " " + result;
		// calling static method of parent by specifying with its class name
		// super is only for instance method 
	}
	
//	public final String foo2() {
//		return "Error!";
//	}
}
