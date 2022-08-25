package ch05.book_05;

public class P170_AdvencedForExample {
	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 };//
		
		int sum = 0;
		for (int score : scores) {
			sum = sum + score;	//scores에 있는 배열의 값이 차례로 들어가면서 실행됨
		}
		System.out.println("점수 총합 = " + sum);
		
		double avg =(double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
		
	}
}
