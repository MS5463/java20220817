package ch03.book.exercise;

public class Exercise04 {
	public static void main(String[] args) {
		int pencils = 534;
		int stydent = 30;
		
		//학생 한 명이 가지는 연필 수
		int pencilsPerStudent = pencils / stydent;
		System.out.println(pencilsPerStudent);
		
		//남은 연필 수
		int pencilsLeft = pencils % stydent;
		System.out.println(pencilsLeft);		
	}
}
