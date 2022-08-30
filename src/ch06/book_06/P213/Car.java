package ch06.book_06.P213;

public class Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car() {
	}
	
	Car(String model) {
//		this.model = "model";
//		this.color = "은색";
//		this.maxSpeed =	250;	
		this(model, "은색", 250);//<= 간략화
	}
	
	Car(String model, String color){
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed){//호출 line 15,line 19 => line22
		this.model = model;
		this.color = color;//		line 23 ~ line 25(공통 실행 코드)	
		this.maxSpeed = maxSpeed;
	}
}
