package ch07.book_07.P294;

public class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
	super(name, ssn);// 부모 생성자 호출, 상위클래스의 필드를 초기화 하는 일을 한다
	this.studentNo = studentNo;
	}
}

