package ch06.lecture.p02constructor;

public class C03Constructor {
	public static void main(String[] args) {
		MyClass3 o1 = new MyClass3("iceman", 77);
		System.out.println(o1.name);// iceman
		System.out.println(o1.age);//	77
		
		MyClass3 o2 = new MyClass3("maverick", 66);
		System.out.println(o2.name);//	maverick
		System.out.println(o2.age);//	66
	}// MyClass3 o3 = new MyClass3();	(x)
}
//생성자를 작성하면
//기본 생성자가 자동으로 삽입되지 않음