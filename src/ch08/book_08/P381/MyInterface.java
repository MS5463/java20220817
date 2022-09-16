package ch08.book_08.P381;

public interface MyInterface {
	public void method1();
	
	public default void method2() {							//
		System.out.println("MyInterface-method2 실행");		//.....디폴트 메소드
	}														//
}
