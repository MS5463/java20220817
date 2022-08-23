package ch04.lecture.p2method;

public class C11Overloading {
	public static void main(String[] args) {
		method1(3, 5);
		method2(9);//파라미터 있는 메소드2
		method2(); //파라미터 없는 메소드2
		method2(3.14);//더블 타입 받는 메소드2
		method2(5);//파라미터 있는 메소드2
		method2(3.14, 3);//더블, 인트
		method2(3, 3.14);//인트, 더블
	}//평소에는 println이 자동으로 overloading되어 있음
	public static void method2(int a, double b) {
		System.out.println("인트, 더블");}
	public static void method2(double a, int b) {
		System.out.println("더블, 인트");}
		
	public static void method2(double a) {
		System.out.println("더블 타입 받는 메소드2");
	}
	public static void method2() {
		//메스드 overloading
		//메소드명이 같아도 파라미터의 타입, 개수, 순서가 다를 수 있음
		System.out.println("파라미터 없는 메소드2");
	}
	public static void method2(int a) {
		System.out.println("파라미터 있는 메소드2");
	}
	public static void method1(int a, int b) {
	}
}
