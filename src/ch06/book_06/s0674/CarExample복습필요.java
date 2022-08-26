package ch06.book_06.s0674;

public class CarExample복습필요 {
	public static void main(String[] args) {
		Car car1 = new Car();//1.생성자 선택
		System.out.println("car1.company : " + car1.company);
		System.out.println();//나머지 변수들은 초기값
		
		Car car2 = new Car("자가용");//2.생성자 선택
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();//나머지 변수들은 초기값
		
		Car car3 = new Car("자가용", "빨강");//3.생성자 선택
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();//나머지 변수들은 초기값
		
		Car car4 = new Car("택시", "검정", 200);//4.생성자 선택
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);	
	}
}
12 : 20