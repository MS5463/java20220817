package ch11.lecture.p02wrapper;

public class C03AutoUnBoxing {
	public static void main(String[] args) {
		Integer a = 99;
		
		//참조타입을 기본타입으로 변경(UnBoxing)
		int b = a.intValue();
		
		//참조타입을 기본타입으로 자동변경(Auto Boxing)
		int c = a;//	(o)
		
		Object d = 99;
//		Integer e = d; (x)
//		int f = d; (X)
		
		int g = (Integer) d;
		
		Object[] arr = {"java", 3, 3.14};
		String h = (String) arr[0];
		Integer i = (Integer) arr[1];
		double j = (Double) arr[2];//(o)
		
		double k = (double) arr[2];//(o)
		System.out.println("프로그램 실행 이어감");
	}
}
