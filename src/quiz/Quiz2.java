package quiz;

public class Quiz2 {

	public static void main(String[] args) {

		int x = 10; // 11
		int y = 20; // 19
		
		int result = (x++) + (--y); // 29
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(result);
	}

}
