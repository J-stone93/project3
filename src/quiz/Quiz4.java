package quiz;

public class Quiz4 {

	public static void main(String[] args) {

		int mathScore = 90;
		int engScore = 70;
		int korScore = 100;
		
		int totalScore = mathScore + engScore + korScore;
		System.out.println("총점 " + totalScore);
		
		double avgScore = (mathScore + engScore + korScore) / 3.0;
		System.out.println("평균 " + avgScore);
		
		
	}

}
