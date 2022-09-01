package ch07.book_07.P332;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone();.....abstract때문에 컴파일 에러
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();//.....Phone의 메소드
		smartPhone.internetSearch();
		smartPhone.turnOff();//.....Phone의 메소드
	}
}
