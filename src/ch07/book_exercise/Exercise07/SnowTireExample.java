package ch07.book_exercise.Exercise07;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();//run은 참조변수
		tire.run();
	}
}
