package ch04.lecture.p2method;

public class C06Parameter {
	public static void main(String[] args) {
		
		sum(1, 10);//1부터 10사이의 정수 합 출령
		sum(1, 100);//1부터 100사이의 정수 합 출령
		sum(50, 200);//1부터 10사이의 정수 합 출령
	}
	private static void sum(int p1, int p2) {
		long sum = 0;
		for (int i = p1; i <= p2; i++) {
			sum += i;
		}
		System.out.println(p1+"와 "+p2+"사이의 합은 "+sum+"입니다.");
	}
}
