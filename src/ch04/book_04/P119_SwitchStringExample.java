package ch04.book_04;

public class P119_SwitchStringExample {
	public static void main(String[] args) {
		String position = "과장";
		
		switch (position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원"); 
			break;
		default:
			System.out.println("300만원");
		}
	}
}
//position에는 int나 long같은 데이터 타입을 넣을 수 있다
//119p