package ch07.book_07.P299;

public class SupersonicAriplaneExample {
	public static void main(String[] args) {
		SupersonicAriplane sa = new SupersonicAriplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAriplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAriplane.NORMAL;
		sa.fly();
		sa.land();
	}
}
