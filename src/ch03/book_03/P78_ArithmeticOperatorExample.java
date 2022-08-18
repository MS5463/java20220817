package ch03.book_03;

public class P78_ArithmeticOperatorExample {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1=" + result1); //5 + 2
		
		int result2 = v1 - v2;
		System.out.println("result2=" + result2);//5 - 2
		
		int result3 = v1 * v2;
		System.out.println("result3=" + result3);//5 * 2
		
		int result4 = v1 / v2;
		System.out.println("result4=" + result4);//5 / 2 (원래는 2.5이나 데이터 타입이 int이므로 정수 2가 됨)
		
		int result5 = v1 % v2;
		System.out.println("result5=" + result5);//5 % 2 (나머지)
		
		double result6 = (double) v1 / v2;	//괄호()를 써야 착각할 가능성이 높음
		System.out.println("result6=" + result6);//5 / 2 (데이터 타입이 Double이므로 소수값도 온전이 표기됨)
		
	}
}
//78p