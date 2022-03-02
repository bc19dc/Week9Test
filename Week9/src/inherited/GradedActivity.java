package inherited;

import javax.swing.JOptionPane;

public class GradedActivity {
	protected double score;

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	public char getGrade() {		
		if (score < 60) return 'F';
		if (score < 70) return 'D';
		if (score < 80) return 'C';
		if (score < 90) return 'B';
		return 'A';
	}
	
	public void display() {
		JOptionPane.showMessageDialog(
			null,
			"Your score is "
			+ getScore()
			+ " Your grade is "
			+ getGrade()
		);
	}
	
	public static String foo() {
		return "You can NEVER override static foo() of parent!!!!";
	}
	
	public final String foo2() {
		return "You can NEVER override and shadowed final foo2() of parent!!!"; 
	}
}
