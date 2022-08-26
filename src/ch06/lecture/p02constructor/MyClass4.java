package ch06.lecture.p02constructor;

public class MyClass4 {
	// fields
	String name;
	int age;
	
	// constructors		
	public MyClass4(String name, int age) {
		this.name = name;//변수중 가장 가까운 것을 봄
		this.age = age;//age 파라미터가 가진 값을 age에 넣음
	}			
}
//가능하면 의미가 있는 이름을 쓸 것
//this를 붙여야 필드를 가르킴
//this : 앞으로만들어질 객체의 참조값