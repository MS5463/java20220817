package ch03.book_03;

public class P082_AccuracyExample1 {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 빼며");
		System.out.println(result + "조각이 남는다.");
	}
}
//float는 0.1을 적확이 표현할 수 없어 근사치로 치리하기 때문에 값이 0.3이 되지 않는다.
//P82_AccuracyExample2로
//82p