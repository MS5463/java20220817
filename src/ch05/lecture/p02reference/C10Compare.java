package ch05.lecture.p02reference;

import java.util.Arrays;

public class C10Compare {
	//그림 : 05 참조타입 비교.png
	public static void main(String[] args) {
		int a = 3;//값 자체가 steak 메모리에 저장됨
		int b = 3;
		
		System.out.println(a == b);//a가지고 있는 값과 b가 가지고 있는 값을 비교
		
		int[] c = new int[] {3, 4, 5};//c와 d는 객체값이 같지만 id가 다르므로 
		int[] d = new int[] {3, 4, 5};//직접적으로 비교시 다르다고 나온다
		
		System.out.println(c == d);//false , id가 다르므로 객체값을 직접적으로 비교하는 것은 불가능
		// content 비교 => true
		System.out.println(Arrays.equals(c, d));//true , 객체값을 직접적으로 비교함
		
		int[] e = c;
		
		e[0] = 33;
		System.out.println(c[0]);//33
		
		System.out.println(e == c);//true	
		
		System.out.println(Arrays.equals(c, e));//false id값이 같아도 객체값을 직접적으로 
												//비교하므로  결과는 false
		}
}
