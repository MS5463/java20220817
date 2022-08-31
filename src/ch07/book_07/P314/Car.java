package ch07.book_07.P314;

public class Car {
	//필드
	Tire frontLeftTire = new Tire("앞원쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤원쪽", 3);
	Tire backtRightTire = new Tire("앞오른쪽", 4);
	//생성자
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if (frontLeftTire.roll()==false) { stop(); return 1; }
		if (frontRightTire.roll()==false) { stop(); return 2; }	//line11~line18모든 타이어를 싱
		if (backLeftTire.roll()==false) { stop(); return 3; }
		if (backtRightTire.roll()==false) { stop(); return 4; }
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
