package ch07.book_07.P314;

public class Tire {
	//필드
	public int maxRotation;
	public int accmulataRotation;
	public String location;
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll() {
		++accmulataRotation;	//누적 회전수 1 증가
		if (accmulataRotation < maxRotation) {					//
			System.out.println(location + " Tire 수명: " + 		//정상 회전(누적<최대)일 경우 실행
					(maxRotation-accmulataRotation) + "회");	//
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 +++");	//펑크(누적=최대)일 경우 실행
			return false;												//
		}
	}
}
