package ch04.lecture.p1control;

public class C04Random {
	public static void main(String[] args) {
		// Math.random() : 0이상 1 미만의 값 리턴
		double d = Math.random();
		System.out.println(d);
		
		
		//Math.random() * 6 : 0.0시상 6미만 double
		System.out.println(d * 6);
		
		//(int) (Math.random()*6) : 0, 1, 2, 3, 4, 5
		System.out.println((int) (d * 6));
		
		//(int) (Math.random()*6) : 1, 2, 3, 4, 5, 6
		System.out.println((int) (d * 6) + 1);
		
		//주사위 (1 ~ 6)
		System.out.println("주사위 던지기");
		System.out.println((int) (Math.random() * 6) +1);
	}
}
