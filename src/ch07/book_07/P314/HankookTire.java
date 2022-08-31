package ch07.book_07.P314;

public class HankookTire extends Tire {
	//필드 
	//생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//메소드
	@Override
	public boolean roll() {
		++accmulataRotation;
		if(accmulataRotation<maxRotation) {
			System.out.println(location + " HankookTire 수명: " +
					(maxRotation-accmulataRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	}//line 10 ~ line 21 출력 내용을 달리하기 위해 재정의(오버라이딩)한 roll() 메소드
}
