package ch12.book_12.P587;

public class ThreadA extends Thread{
	public ThreadA() {
		setName("ThreadA");//.....스래드 이름 설정
	}
	
	public void run() {
		for (int i = 0; i < 2; i++) {//							┐
			System.out.println(getName() + "가 출력한 내용");// │.....Thread A 실행 내용
		}//						  └스레드 이름 얻기				┘
	}
}
