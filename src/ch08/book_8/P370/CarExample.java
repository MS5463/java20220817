package ch08.book_8.P370;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		myCar.run();
				
		myCar.tires[0] = new KumhoTire();
		myCar.tires[0] = new KumhoTire();
				
		myCar.run();
	}
}
