package ch10.lecture.p02try;

public class C01Try {
	public static void main(String[] args) {
		int a = 3;
		int b = 2;
		
		try {		
			// try : Exception 이 발생할 수 있는 코드 블럭
			
			int c = a / b;
			System.out.println(c);//Exception 발생 여부에 따라 실행 여부가 달라짐
			
		}catch(ArithmeticException e) {
			//발생할 Exception 객체 잡고 실행하는 코드 블럭, 단 Exception 이 발생하지 않았을 경우 
			//catch 블록은 실행되지 않음
			System.out.println("Exception 발생하면 실행되는 코드 블록");
		}
		
	}
}
