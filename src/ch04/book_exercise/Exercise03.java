package ch04.book_exercise;

public class Exercise03 {
	public static void main(String[] args) {
		int num3 = 0;
		
		int i = 0;
		
		for (i=0; i<100; i+=3) {
			num3 += i;
		}
		
		System.out.println("3의 배수의 합 : " + num3);
	}
}
/*		예시문
 
 		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if ((i % 3) == 0) {
				sum += i;
			}
		}
		
		System.out.println(sum);
 */