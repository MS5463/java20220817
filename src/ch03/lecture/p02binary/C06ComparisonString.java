package ch03.lecture.p02binary;

public class C06ComparisonString {
	public static void main(String[] args) {
		// String 끼리 비교 크기 연산(<, <=, >, >=) 안됨 
		String a = "hello";
		String b = "hi";
		
//		System.out.println(a < b); // x
		
		// String 끼리는 비교연산자(==, !=)로 같은지 확인 할 수 있다.
		// equals 메소드 쓰기!!!
		String c = "java";
		String d = "java";
		String e = "ja";
		String f = "va";
		String g = e + f; // "java"
		
		System.out.println(c == d); // true
		System.out.println(c == g); // false
		
		System.out.println(c.equals(d)); // true
		System.out.println(c.equals(g)); // true
		
	}
}