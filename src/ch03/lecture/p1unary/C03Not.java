package ch03.lecture.p1unary;

public class C03Not {
	public static void main(String[] args) {
		// 논리부정연산자 (not)
		// !
		// 피연산자는 boolean
		// 연산결과는 boolean, 피연산자를 반대값으로 (True -> False, False -> True)
		
		boolean a = true;
		boolean b = false;
		
		boolean c = !a;
		boolean d = !b;
		System.out.println(c);	//False
		System.out.println(d);	//True
		
		System.out.println(!c);	//True
		System.out.println(!d);	//False
		
		System.out.println(c); // False
		System.out.println(d); // True
	}
}
