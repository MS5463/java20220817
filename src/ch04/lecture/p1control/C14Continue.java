package ch04.lecture.p1control;

public class C14Continue {
	public static void main(String[] args) {
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			System.out.println(2);
			
			if (true) {
				continue;
			}
			System.out.println(3);
		}
		System.out.println(4);
	}
}
