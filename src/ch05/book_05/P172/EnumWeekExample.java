package ch05.book_05.P172;

import java.util.Calendar;//.....Calendar 클래스는 java.util 패키지에 있으므로 import가 필요하다.

public class EnumWeekExample {
	public static void main(String[] args) {
		Week today = null;//.....열거 타입 변수 선언
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);//일(1)~토(7)까지의 숫자를 리턴
		
		switch (week) {
		case 1:
			today = Week.SUNDAY; break;
//			└  열거 상수 대입  ┘
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNEDAY; break;
		case 5:
			today = Week.THURDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATUDAY; break;
		}
			
		System.out.println("오늘 요일: " + today);
		
		if (today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}
	}
}
