package ch04.book_exercise;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;
		int money = 10000;
		int balance = 0;
				
		Scanner scanner = new Scanner(System.in); 
		
		while (run) {
			System.out.println("==================================");
			System.out.println("1. 예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("==================================");
			System.out.print("선택> ");
			
			balance = scanner.nextInt();
			
			  if (1 == balance) {
				System.out.print("예금액> ");
				int key = scanner.nextInt();
				money += key;
				
			} else if (2 == balance) {
				System.out.print("출금액> ");
				int key = scanner.nextInt();
				money -= key;
				
			} else if (3 == balance) {
				System.out.println("잔고>"+money);
			} else if (4 == balance) {
				run = false;
			}
			
		}
		
		System.out.println("프로그램 종료");
	}
}
