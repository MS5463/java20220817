package ch05.lecture.p03string;
	
public class C04Garbage {
	//그림 : 07쓰레기.png
	public static void main(String[] args) {
		int[] a = {3, 4};
		a = new int[] {9, 10};//01.새로운 instance를 넣어서 참조값에 넣음
	}
}
