package ch05.lecture.p02reference;

import java.util.Iterator;

public class C11ForEach {
	public static void main(String[] args) {
		//향상된 for (enhanced for, for-each)
		
		int[] a = {5, 7, 9 ,11};
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("향상된 FOR");
		for (int item : a) {//배열에 있는 값을 차레로 넣어서 실행함
			System.out.println(item);
		}
	}
}
