package ch06.book_06;

public class P239_CalculatorExample {
	public static void main(String[] args) {
		double result1 = 10 * 10 * P238_Calculator.pi;
		int result2 = P238_Calculator.plus(10, 5);
		int result3 = P238_Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}
}
