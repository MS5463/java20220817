package ch04.lecture.p1control;

import java.util.Scanner;

public class C18GuessNumber실습필요_127p {
	public static void main(String[] args) {
		// 컴퓨터 1~100 random
		int com = (int) (Math.random() * 100) + 1;
		
//		System.out.println(com);
		
		Scanner scanner = new Scanner(System.in);
		// ctrl + Shift + o : import 추가
		System.out.println("1이상 100이하에 숫자를 입력해 주세요.");
		while (true) {
			int user = scanner.nextInt();
			
			if (com == user) {
				System.out.println("정답입니다.");
				break;
			} else if (com>user) {
				System.out.println("더 큰 수를 입력해 주세요");
			} else { 
				System.out.println("더 작은 수를 입력해 주세요");
			}
		}
	}	
}


