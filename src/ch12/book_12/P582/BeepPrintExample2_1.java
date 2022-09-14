package ch12.book_12.P582;

public class BeepPrintExample2_1 {
	public static void main(String[] args) {
//						└메인 스레드
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();//.....BeepRunnable(BeepTask)
		
		for (int i = 0; i < 5; i++) {
			System.out.println("땅");
			try { Thread.sleep(500); } 
				  catch(Exception e) {}
		}
	}
}
