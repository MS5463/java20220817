package ch08.lecture.p03others;

public class MyClass1_2 implements MyInterface1{//아무것도 상속하지 않을 경우 Object를 상속하게 된다.
	@Override
	public void method() {
	}
	
	//default method Override 가능
	@Override
	public void method2() {
		MyInterface1.super.method2();	
	}
}
