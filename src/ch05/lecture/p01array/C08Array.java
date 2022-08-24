package ch05.lecture.p01array;

public class C08Array {
	// 04 이차배열.png
	public static void main(String[] args) {
		
		int[] a = {4, 5, 6};//프리미티브 타입
		
		int[][] b;	//	각 아이템의 type이 int[]-참조타입
		b = new int[][] {{1, 2}, {100, 200}, {5,6}};//stack의 b가 저장됨
			//heap에는{1, 2}/{100, 200}/{5,6}이랑 그 아이템을 호출하는 주소도 저장됨 
		
		System.out.println(b[0][0]);
		System.out.println(b[0][1]);
		System.out.println(b[1][0]);	//100
		System.out.println(b[1][1]);	//200	
		System.out.println(b[2][0]);	//5
		System.out.println(b[2][1]);	//6
	}
}
