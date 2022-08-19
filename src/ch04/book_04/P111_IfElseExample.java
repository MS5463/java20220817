package ch04.book_04;

public class P111_IfElseExample {
	public static void main(String[] args) {
		int score = 90;
			
			if(score>=90) {
				System.out.println("점수가 90보다 큽니다");
				System.out.println("등급은 A 입니다");
			} else {//score<90일 경우
				System.out.println("점수가 90보다 작습니다");
				System.out.println("등급은 B 입니다");
			}
	}
}
//p111