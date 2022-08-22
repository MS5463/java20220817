package ch04.book_exercise;

public class Exercise05 {
	public static void main(String[] args) {
		// 4x + 5y = 60
		// 1 <= x.u <= 10
		
		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				
				int r = (4 * x) + (5 * y);
				
				if (r == 60) {
					System.out.println(x + ", " + y);
				}
			}
		}
	}
}
