package ch06.book_exercise.Exercise18;

public class ShopService {
	private static ShopService ins;
	
	private ShopService() {
		
	}
	
	public static ShopService getInstance() {
		if (ins == null) {
			ins = new ShopService();
		}
		return ins;//line 4에 있는 ins값 리턴 됨
	}
}
