package ch04.book_exercise;

public class Exercise06 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		System.out.println("엔터");
		System.out.print("없이");//끝에 엔터 없음
		System.out.println("작동");
		System.out.println();
		System.out.println();
		System.out.println("작동 바로 뒤");
		
		
		
	}
}
