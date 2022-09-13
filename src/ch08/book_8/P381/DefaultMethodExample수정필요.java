package ch08.book_8.P381;

public class DefaultMethodExample수정필요 {
	public static void main(String[] args) {
		MyInterface mi1 = new MyClassA();
		mi1.method1();//재정의한 메소드 실행
		mi1.method2();
		
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2();//디폴트 메소드이나 재정의한 메소드 실행
	}
}ㅁ
