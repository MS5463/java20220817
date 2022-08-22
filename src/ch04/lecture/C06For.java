package ch04.lecture;

public class C06For {
	public static void main(String[] args) {
		System.out.println(1);
			
		//실행흐름
		//1 => 2 -true- => 3 => 4 -반복- =>2
		//       -false => for문 종료
		for (int i = 1;	//1. 초기값(코드 블록 밖에서 변수를 선언 했을경우 생략 가능)
				
		    	  i<=3;	//2. 조건식
				
			      i++   //4. 증감식(증감식과 초기값은 둘 이상 사용 가능하다
				
				) {     //3. 실행문(코드블럭)
			System.out.println(2);
			System.out.println(3);
		}
		
		
		System.out.println(4);
	}
	
}
//코드 블록 내에서 선언 될 경우 로컬 변수이기 때문에 for문 밖에서 사용 불가능 하다.