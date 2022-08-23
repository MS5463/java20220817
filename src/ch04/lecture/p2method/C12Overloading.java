package ch04.lecture.p2method;

public class C12Overloading {
	public static void main(String[] args) {
		double a = half(5.0);
		System.out.println(a);// 2.5
		
		double b = half(5);
		System.out.println(b);// 2
		//2개의 메소드 사용할 것
	}
	public static double half(int i) {
		return i/2;
	}
	public static double half(double i) {
		return i/2;
	}
}
