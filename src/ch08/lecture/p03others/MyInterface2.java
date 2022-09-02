package ch08.lecture.p03others;

public interface MyInterface2 {
	void method1();//추상 메소드
	
	//default 메소드
	default void method2() {
		System.out.println("공통코드");
		System.out.println("메소드2 전용 코드들");
	}
	
	//default 메소드
	default void method3() {
		System.out.println("공통코드");
		System.out.println("메소드3 전용 코드들");
	}
	
	//private 추가 가능
	default void commonMethod() {//public  메소드
		System.out.println("공통코드");
	}
}
