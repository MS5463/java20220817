package ch05.lecture.p03string;

public class C02New {
	public static void main(String[] args) {
		//new 연산자 : 새로운 객체(instance)의 참조값을 연산결과로 낸다
		String str1 = new String("java");//new연산자는 생략할 수 없으나 string은 가능함
		
		
		String str2 = new String("java");
		//str1과 str2는 객체값이 다르다.
		
		String str3 = "java";		//new연산자를 생략하고 string literal
									//new 연산자 생략하고  string literal작성하면 이미 있는
									//참조값 활용
		String str4 = "java";
		//str3과 str4는 객체값이 같다.
		
	}
}
//new 연산자를 통해 생성하는 경우 Heap 메모리 영역에 할당되고 
//리터럴을 이용한 경우에는 Heap 메모리 영역 안에 String Constant Pool이라는 영역에 할당된다.