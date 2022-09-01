package ch08.book_8.P374;

public class Bus implements Vehicle{
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");//재정의를 하지 않을 경우 컴파일 오류 발생
	}
	
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}
