package ch08.book_exercise.Exercise03;

public class SoundableExample {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}
class Cat implements Soundable{
	@Override
	public String sound() {
		return "야옹";
	}
}