package ch03.lecture.p03ternary;

public class C01Ternary {
	public static void main(String[] args) {
		// 삼항 연산자 ?:
		// (1항) > (2항) : (3항)
		// 연산결과 1항(true)  -> 2항
		//		    1항(false) -> 항
		
		System.out.println(true ? 3 : 2);	//3
		System.out.println(false ? 3 : 2);	//2
	}
}
