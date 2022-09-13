package ch10.book_10;

public class P431_TryCatchFinallyRuntimeExceptionExample수정필요 {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];//예외 발생
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");						//line 8에서 	
			System.out.println("[실행 방법]");											//예외 발생시
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");//실행
			return;//return이 없으면 try 반복 실행
		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result =value1 + value2;
			System.out.println(data1 + "+" + data2 + "+" + result);
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}ㅁ
