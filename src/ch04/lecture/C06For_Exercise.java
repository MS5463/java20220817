package ch04.lecture;

public class C06For_Exercise {
	public static void main(String[] args) {
		System.out.println("1~5");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}	//1~5
		
		System.out.println("5~10");
		for (int i = 5; i <= 10; i++) {
			System.out.println(i);
		}	//5~10
		
		System.out.println("5~1");
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}	//5~1
		
		System.out.println("10~5");
		for (int i = 10; i >= 5; i--) {
			System.out.println(i);
		}	//10~5
		//System.out.println(i);  i는 코드블록 안에서 선언 되었기 때문에 코드블록 밖에서 쓸 수 없다.
	}
}
