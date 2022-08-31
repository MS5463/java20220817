package ch07.book_07.P314;

public class Car {
	//필드
	Tire frontLeftTire = new Tire("앞원쪽", 6);			//
	Tire frontRightTire = new Tire("앞오른쪽", 2);		// 자동차는 4개의
	Tire backLeftTire = new Tire("뒤원쪽", 3);			// 타이어를 가진다.
	Tire backRightTire = new Tire("앞오른쪽", 4);		//
	//생성자
	//메소드
	int run() {													// 모든 타이어를 1회 회전시키기 
		System.out.println("[자동차가 달립니다.]");				// 위해 각 Tire 객체의
		if (frontLeftTire.roll()==false) { stop(); return 1; }	// roll() 메소드를 호출한다.
		if (frontRightTire.roll()==false) { stop(); return 2; }	// false를 리턴하는 
		if (backLeftTire.roll()==false) { stop(); return 3; }	// roll()이 있을 경우
		if (backRightTire.roll()==false) { stop(); return 4; }	// stop()메소드를 호출하고
		return 0;												// 해당 타이어 번호를
	}															// 리턴한다.
	
	void stop() {										//
		System.out.println("[자동차가 멈춥니다.]");		// 펑크 났을 때 실행
	}													//
}
