package ch12.book_12.P584;

import java.awt.Toolkit;

public class BeepPrintExample3_2 {
	Thread thread = new Thread() {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();			//
		for (int i = 0; i < 5; i++) {							//
			toolkit.beep();										//.....스레드 실행 내용
			try { Thread.sleep(500); } catch (Exception e) {}	//
		}														//
	}
};
}
