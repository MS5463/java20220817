package ch03.book_03;

public class P092_LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A';
		
		if ( (charCode>=65) & (charCode<=90)) {
			System.out.println("대문자 이군요");
		}
		
		if ( (charCode>=97) && (charCode<=122) ) {	//charCode<=122는 실행하지 않음
			System.out.println("소문자 이군요");
		}
		
		if ( !(charCode<48) && !(charCode>57) ) {
			System.out.println("0~9 숫자 이군요");
		} 
		
		int value = 6;
		
		if ( (value%2==0) | (value%3==0) ) {
			System.out.println("2 도는 3의 배수 이군요");
		}
		
		if ( (value%2==0) || (value%3==0) ) {		//value%3==0은 실행되지 않음
			System.out.println("2 도는 3의 배수 이군요");
		}
	}
}
//92p
