package ch03.book_03;

public class P084_InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x / y;
	  //double z = x % y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		
		System.out.println(z + 2);	//문제가 되는 코드
		
		/*if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println(z + 2);
			}*/
	}
}
//Double.isInfinite(z) || Double.isNaN(z)가 true이면 "값 산출 불가", false이면 z + 2의 결과값이 산출
//84p