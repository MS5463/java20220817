package ch08.book_08.P367;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.fontLeftTire = new KumhoTire();
		myCar.fontRightTire = new KumhoTire();
		
		myCar.run();
	}
}
