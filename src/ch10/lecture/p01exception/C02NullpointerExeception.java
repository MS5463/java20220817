package ch10.lecture.p01exception;

public class C02NullpointerExeception {
	public static void main(String[] args) {
		String a = "topgun";
		String b = null;//참조하는 인스턴스(객체) 없음
		
		System.out.println(a.length());
		System.out.println(b.length());//nullpointerException
		
		System.out.println("프로그램 종료");
	}
}
