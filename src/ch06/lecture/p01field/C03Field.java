package ch06.lecture.p01field;

public class C03Field {
	public static void main(String[] args) {
		MyClass2 o1 = new MyClass2();
		
		o1.name = "java";
		o1.color = "blue";
		o1.age = 90;
		o1.scores = 3.14;
		
		System.out.println(o1.name);
		System.out.println(o1.color);
		System.out.println(o1.age);
		System.out.println(o1.scores);
				
		MyClass2 o2 = new MyClass2();
		
		o2.name = "maverick";
		o2.color = "black";
		o2.age = 50;
		o2.scores = 99.9;
		
		System.out.println(o2.name);
		System.out.println(o2.color);
		System.out.println(o2.age);
		System.out.println(o2.scores);
	}
}