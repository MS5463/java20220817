package ch10.book_10;

public class P423_NullPointerExceptionExample {
	public static void main(String[] args) {
		String data = null;
		System.out.println(data.toString());
		//가르키고 있는 메소드가 없는데도 인스턴스 메소드를 사용함
	}
}
