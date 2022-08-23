package ch04.lecture.p1control;

import java.util.Scanner;

public class C20GuessNumber {
	public static void main(String[] args) {
		int com = (int)(Math.random() * 100) + 1;
		
		Scanner scanner = new Scanner(System.in);
		
		int user = 0;
		do {
			System.out.println("(1~100) 입력 :");
			
			user = scanner.nextInt();
					
		} while (com != user);
		
	}
}
