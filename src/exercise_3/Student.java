package exercise_3;

public class Student {
	
	public double score;
	
	public void addScore(double value) {
		score += value;
	}
	
	public String toString() {
		if(score <= 60) {
			return "FINAL GRADE = " + score + "\nFAILED\nMissing " + String.format("%.2f", 60 - score) + " POINTS";
		}
		return "FINAL GRADE = " + score + "\nPASS";
	}

}
