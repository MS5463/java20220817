package ch07.book_exercise.Exercise05;

public class Child extends Parent {
	private int studentNo;
	
	public Child(String name, int studentNo) { 
		super(name);//부모클래스의 생성자를 호출함
//		this.name = name;
		this.studentNo = studentNo;
	}
}
