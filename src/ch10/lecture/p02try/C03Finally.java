package ch10.lecture.p02try;

public class C03Finally {
	public static void main(String[] args) {
		try {
			int a = 3 / 0;
			if (a == 1) {
				return;
			}
		}catch(ArithmeticException e) {
			System.out.println("exception!!!!");
		}
	}
}
