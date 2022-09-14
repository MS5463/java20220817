package ch12.lecture;

public class C05ThreadName {
	public static void main(String[] args) {
		Thread t1 = new Task5();
		t1.setName("문자출력 쓰레드");
		t1.setPriority(10);//가장 높은 우선순위(반드시 먼저 실행되는 것은 아님)
		t1.start();
		
		Thread t2 = new Task5();
		t2.setName("소리출력 쓰레드");
		t2.setPriority(1);//가장 낮은 우선순위(반드시 나중에 실행되는 것은 아님)
		t2.start();
	}
}

class Task5 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 100000; i++) {
			System.out.println(getName() + ":" + i);
		}
	}
}
//출력하는 자원이 하나라서 시스템 상 번갈아 가면서 출력됨