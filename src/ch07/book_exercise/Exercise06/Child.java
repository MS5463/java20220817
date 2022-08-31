package ch07.book_exercise.Exercise06;

public class Child extends Parent {
	private String name;
	
	public Child() {
		this("홍길동");//4. 다른생성자 호출
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		super();//상위 클래스 생성자 호출(작성 불필요)
		this.name = name;//3
		System.out.println("Child(String name) call");
	}
}
