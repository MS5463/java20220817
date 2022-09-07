package ch11.lecture.p02wrapper;

import java.util.Arrays;

public class C01Wrapper {
	public static void main(String[] args) {
		// data type : primitive type(2장), reference type(5장)
		
		// 기본타입 8개 -> 포장 클래스 8개 (527p)
		//  byte			 Byte
		//  char			 Character
		//  short			 Short
		//  int 			 Integer
		//  long			 Long
		//  float			 Float
		//  double			 Double
		//  boolean			 Boolean
		
		String[] arr1= new String[3];
		arr1[0] = "coyote";
		arr1[1] = "rooster";
		arr1[2] = "iceman";
		
		int[] arr2= new int[3];
		arr2[0] = 99;
		arr2[1] = 100;
		arr2[2] = 300;
		
		int a = 3;
		Integer b = Integer.valueOf(3);
		
//		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		Object[] arr3 = new Object[3];
		arr3[0] = "phoenix";
		arr3[1] = Integer.valueOf(99);
		arr3[2] = Integer.valueOf(100);
		
		System.out.println(Arrays.toString(arr3));
	}
}
