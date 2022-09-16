package ch08.book_08.P370;

public class Car {
	Tire[] tires = {
		new HankookTire(),
		new HankookTire(),
		new HankookTire(),
		new HankookTire()
	};
	
	void run() {
	for(Tire tire : tires) {
		tire.roll();
		}
	}
}