package ch08.book_8.P374;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();//vehicle 타입이기 때문에 run 메소드만 실행시킬 수 있음
		
		vehicle.run();
		//vehicle.checkFare();	(x).....Vehicle 인터페이스에는 checkFare()가 없음
		
		Bus bus =(Bus) vehicle;//.....강제 타입 변환
		
		bus.run();
		bus.checkFare();//.....Bus 클래스에는 checkFare()가 있음
	}
}
