package ch06.lecture.p09GetSet;

public class MyClass1 {
	private int age;//이 필드에 접근 할 때 필드 밖에서는 접근할 수 없도록 private으로 한다
	
	//getter
	public int getAge() {
		return age;
	}
	
	//setter
	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		}
	}
}
