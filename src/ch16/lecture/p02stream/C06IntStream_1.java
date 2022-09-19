package ch16.lecture.p02stream;

import java.util.Iterator;

public class C06IntStream_1 {
	public static void main(String[] args) {
		// 1.1~10까지 출력
			System.out.println("1~10까지 출력");
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
			}
			
		// 2.1~100까지의 합 출력
			System.out.println("1~100까지의 합 출력");
			int sum1 = 0;
			for (int i = 1; i <= 100; i++) {
				sum1 += i;
			}
			System.out.println(sum1);
			
		// 3.1~100까지의 수 중 홀 수의 합 출력
			System.out.println("1~100까지의 수 중 홀 수의 합 출력");
			int sum2 = 0;
			for (int i = 1; i <= 100; i++) {
				if (i % 2 != 0) {
					sum2 +=	i;
				}
			}
			System.out.println(sum2);
			
		// 4.[5, 10, 20, 1, 6] 의 평균 구하기
			System.out.println("[5, 10, 20, 1, 6] 의 평균 구하기");
			int[] arrays = {5, 10, 20, 1, 6};
			double sum3 = 0;
			for (int i = 0; i < arrays.length; i++) {
				sum3 +=	arrays[i];  
			}
			System.out.println(sum3 / arrays.length);
		
		// 5.주사위(1~6) 5번 던진 결과 출력
			System.out.println("주사위(1~6) 5번 던진 결과 출력");
			for (int i = 0; i < 5; i++) {
				int num = (int)(Math.random() * 6) + 1;
				System.out.println(num);
			}
			
		// 6.로또 번호(1~45) 6개 작은 수부터 출력 (중복 없이)
			a
	}
}
