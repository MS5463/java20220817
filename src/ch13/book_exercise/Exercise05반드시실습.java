package ch13.book_exercise;

import java.util.function.IntBinaryOperator;

public class Exercise05반드시실습 {
	private static int[] scores = { 10, 50, 3 };
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		//최대값 얻기
		int max = maxOrMin(
				
		//작성
				
		);
		System.out.println("최대값: " + max);
		
		//최소값 얻기
		int min = maxOrMin(
				
	);
		System.out.println("최소값: " + min);
	}
}
