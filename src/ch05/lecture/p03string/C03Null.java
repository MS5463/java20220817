package ch05.lecture.p03string;

public class C03Null {
	public static void main(String[] args) {
		int[] a;//null
		String b;
		String c = "java";// 참조하는 객체가 있으므로 기능이나 속성을 사용하는데 문제없음
		
		a = null;// null값을 직접 넣어줄 수 있다. 참조하는 객체가 없음
		b = null;// 참조하는 객체가 없음
		
		System.out.println(c.length());
		System.out.println(b.length());//NullPointerException
	}
}
