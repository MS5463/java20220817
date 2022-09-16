package ch08.book_08.P367;

public class Car {
	Tire fontLeftTire = new HankookTire();	//
	Tire fontRightTire = new HankookTire();	// 인터페이스 타입 필드 선언과
	Tire backLeftTire = new HankookTire();	// 초기 구현 객체 대입
	Tire backRightTire = new HankookTire();	//
	
	void run() {
		fontLeftTire.roll();	//
		fontRightTire.roll();	// 인터페이스에서 설명된
		backLeftTire.roll();	// roll() 메소드 호출
		backRightTire.roll();	//
	}
}
