package ch10.lecture.p02try;

public class C02Finally수정필요 {
	public static void main(String[] args) {
		int a = 3;
		int b = 0;
		
		try {
			int c = a / b;
			
			//exception 발생하지 않으면 실행되는 코드들
			System.out.println("익셉션 발생안해서 실행됨");
			System.out.println(c);
			
		} catch(ArithmeticException e){
			//exception 발생하지 않으면 실행되는 코드들
			System.out.println("익셉션 발생서 실행되는 코드들");
		} finally {
			//exception 발생 여부 실행되는 코드들
			System.out.println("익셉션 발생 여부 관계없이 실행");
		}
		System.out.println("실행흐름 계속 이어짐");
	}
}
ㅁ