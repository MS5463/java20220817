package ch06.lecture.p01field;

import java.util.Scanner;

public class C05Constructor복습필요 {
	public static void main(String[] args) {
		
		String s1 = new String("java");
		Scanner scanner = new Scanner("Hello");
		
		String s2 = new String();
		String s3 = new String(new byte[] {});
		String s4 = new String(new char[] {});
		String s5 = new String(new byte[] {}, 1, 2);
	}
}
a