package ch04.book_04;

public class P125_WhileSymFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;//합게를 저장할 변수
		
		int i = 1;//카운터 변수
		
		while (i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}//								^카운터 변수	  ^합게를 저장할 변수							
}
//125p