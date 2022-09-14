package ch12.book_12.P582;

import java.awt.Toolkit;

public class BeepPrintExample2_3 {
	//람다식 이용
	Thread thread = new Thread(() -> {
		Toolkit toolkit = Toolkit.getDefaultToolkit();			//┐
		for (int i = 0; i < 5; i++) {							//│
			toolkit.beep();										//│.....스레드 실행 내용
			try { Thread.sleep(500); } catch (Exception e) {}	//│
		}														//┘
	});
}
