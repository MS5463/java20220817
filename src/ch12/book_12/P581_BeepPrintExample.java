package ch12.book_12;

import java.awt.Toolkit;

public class P581_BeepPrintExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();//.....Toolkit 객체 얻기
		for (int i = 0; i < 5; i++) {
			toolkit.beep();//.....비프음 발생
			try { Thread.sleep(500); } catch(Exception e) {}
		}//		└ 0.5초간 일시 정지  ┘
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}//		└ 0.5초간 일시 정지  ┘
	}
}
