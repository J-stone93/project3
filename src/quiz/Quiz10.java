package quiz;

public class Quiz10 {

	public static void main(String[] args) {

//		int x = 5;
//		int y = 3;
		
		char ch = (5 > 3) ? '오' : '삼';
		System.out.println(ch);
		
		int x = 10;
		int y = 20;
		int result = (x > 10) ? y + 10 : y - 10; //false 20 - 10 > 10 
		System.out.println(result); //10
		
	}

}
