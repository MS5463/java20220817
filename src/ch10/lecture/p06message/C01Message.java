package ch10.lecture.p06message;

public class C01Message {
	public static void main(String[] args) {
		System.out.println("메인 코드 1");
		method1();
		
		System.out.println("메인 실행 이어감~");
	}

	private static void method1() {
		System.out.println("메소드1 코드");
		try {
			method2();
		} catch (Exception e) {
			// catch 블록만 작성할경우 그냥 두면 오류를 찾기 어려움(주석을 통해 로그를 반드시 남길것!)
			// Exception이 발생한다면 어떤 이유로 발생했는지
			// e.prinntStackTrace()는 Exception이 발생한 이유와 위치는 어디에서 발생했는지 
			// 전체적인 단계를 다 출력한다. 지우지 말고 반드시 나둘것!
			// 자동완성으로 코드를 완성했을 경우 자체적으로 작성해서 반드시 집어넣을 것
			e.printStackTrace();
		} 
		System.out.println("메소드 1 실행 이어감");
		}
		private static void method2() throws Exception {
			throw new Exception("어떤 이유로 발생했는지");	
		}
}
