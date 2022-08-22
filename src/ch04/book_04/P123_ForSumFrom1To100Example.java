package ch04.book_04;

import java.util.Iterator;

public class P123_ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;//합계 변수
		
		int i = 0;//카운터 변수
		
		for (i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}//                             ^카운터 변수      ^합계 변수
}
