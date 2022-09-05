package ch10.book_exercise;

public class Exercise06 {
	public static void main(String[] args) {
		String[] strArray = { "10", "2a" };
		int value = 0;
		for (int i = 0; i <= 2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했음");
			} catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음");
			} finally {
				System.out.println(value);
			}
		}
	}
}
//1.value 실행후 finally 실행. 
//2.value 실행 도중 Number로 넘어간 후 finally 실행. value는 실행 도중에 넘어갔으므로 값은 여전이 10 
//3.value 실행 도중 Array로 넘어간 후 finally 실행. value는 실행 도중에 넘어갔으므로 값은 여전이 10 
