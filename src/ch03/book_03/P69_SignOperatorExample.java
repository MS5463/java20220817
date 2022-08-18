package ch03.book_03;

public class P69_SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;	//부호 안바뀜						
		int result2 = -x;	//부호 바뀜
		
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		short s = 100;
		//short result3 = -s;	//컴파일 에러	
		int result3 = -s;	
		System.out.println("result3=" + result3);
		
	}
}
//69p