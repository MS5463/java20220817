package ch03.book_03;

public class P091_StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");
		
		System.out.println( strVar1 == strVar2 );//true
		System.out.println( strVar1 == strVar3 );//false
		System.out.println();
		System.out.println( strVar1.equals(strVar2) );//true
		System.out.println( strVar1.equals(strVar3) );//true
	}
}
//동등비교연산자(==)는 숫자는 비교할 수 있었도 글자는 비교할 수 없으므로
//String 객체의 문자열을 비교하고 싶을 때는 equals() 메소드를 사용해야 한다.
//중요하므로 외울 것!
//91p