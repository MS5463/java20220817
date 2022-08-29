package ch06.book_06.P259_3.package1;//......패키지가 동일

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;	//(o)
		a.field2 = 1;	//(o)	
//		a.field3 = 1;	//(x)......private 필드 접근 불가(컴파일 에러)
		
		a.method1();	//(o)
		a.method2();	//(o)
//		a.method3();	//(x)......private 메소드 접근 불가(컴파일 에러)
	}
}
