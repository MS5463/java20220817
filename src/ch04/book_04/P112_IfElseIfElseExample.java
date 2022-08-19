package ch04.book_04;

public class P112_IfElseIfElseExample {
	public static void main(String[] args) {
		int score = 75;
		
		if (score>=90) {
			System.out.println("점수가 100~90 입니다."); 
			System.out.println("등급을 A 입니다.");
		} else if (score>=80) { //80<=score<90일 경우
			System.out.println("점수가 89~80 입니다."); 
			System.out.println("등급을 B 입니다.");
		} else if (score>=70) { //70<=score<80일 경우
			System.out.println("점수가 79~70 입니다."); 
			System.out.println("등급을 C 입니다.");
		} else {				//score<70일 경우
			System.out.println("점수가 70 미만 입니다."); 
			System.out.println("등급을 D 입니다.");
		}
	} 
}
