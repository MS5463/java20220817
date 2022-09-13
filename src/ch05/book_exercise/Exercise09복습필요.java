package ch05.book_exercise;

import java.util.Scanner;

public class Exercise09복습필요 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택> ");
			
		int	selectNo = scanner.nextInt();
		
		if(selectNo == 1) {
			//학생수
			System.out.print("학생수> ");
			studentNum = scanner.nextInt();
			scores = new int[studentNum];
		} else if (selectNo == 2) {
			//점수입력
			for (int i = 0; i < scores.length; i++) {
				System.out.print("scores[" + i + "]>");
				scores[i] = scanner.nextInt();
			}
		} else if (selectNo == 3) {
			//점수리스트
			System.out.print("scores[" + scores +"]> ");
			
			
		} else if (selectNo == 4) {
			//분석
			int max = 0;
			int sum = 0;
			double avg = 0.0;
			for (int i = 0; i < scores.length; i++) {
				max = (max < scores[i]) ? scores[i] : max;
			}
			System.out.print("최고 점수: ");
			System.out.print("평균 점수: ");
			
		} else if (selectNo == 5) {
			//종료
			run = false;
		}
 	}
		System.out.println("프로그램 종료");
	}
}
a