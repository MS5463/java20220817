package ch03.book_03;

public class P088_CompareOperatorExample1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);	//true
		boolean result2 = (num1 != num2);	//false
		boolean result3 = (num1 <= num2);	//true
		System.out.println("result1=" + result1);	
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);	//B가 코드값이 더 크다.
		System.out.println("result4=" + result4);
	}
}
//타입이 같아야 비교가 가능하다.
//88p