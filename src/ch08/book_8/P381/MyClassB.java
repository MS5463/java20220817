package ch08.book_8.P381;

public class MyClassB implements MyInterface {
	@Override
	public void method1() {
		System.out.println("MyClassB-method1() 실행");	
	}
	
	@Override
	public void method2() {								//
		System.out.println("MyClassB-method2() 실행");	//.....디폴트 메소드 재정의
	}													//
}
