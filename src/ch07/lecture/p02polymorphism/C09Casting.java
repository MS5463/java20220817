package ch07.lecture.p02polymorphism;

public class C09Casting {
	public static void main(String[] args) {
		SuperClass4 o1 = new SubClass4_1();
		SubClass4_1 o2 = (SubClass4_1) o1;
		
		SuperClass4 o3 = new SubClass4_2();
		
		// instanceof 연산 : 결과 boolean
		// 좌항:참조변수
		// 우항:타입명(클래스, 인터페이스)
		
		System.out.println(o3 instanceof SubClass4_2); // true
		System.out.println(o3 instanceof SuperClass4); // true
		System.out.println(o3 instanceof SubClass4_1); // false
		
		if (o3 instanceof SubClass4_1) {
			SubClass4_1 o4 = (SubClass4_1) o3;
		}
		
		System.out.println("프로그램 종료");
	}
}
