package ch12.book_12.P584;

public class BeepPrintExample3_1 {
	public static void main(String[] args) {
//						└메인 스레드		
		Thread thread = new BeepThread();
		thread.start();//.....BeepTread(스레드 실행 내용)
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } 
				  catch (Exception e) {}
		}
	}
}
