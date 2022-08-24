package ch03.lecture.p02binary;

public class C08ShortCircuit {
	public static void main(String[] args) {
		// short circuit
		// &&, || => 발생
		int i = 3;
		
		if (i < 0 && i > -5) {
			System.out.println("i는 -5보다 크고 0보다 작다");
		}
		
		if ((i++) < 0 && (i++) > -5) {
			System.out.println("i는 -5보다 크고 0보다 작다");
		}
		
		System.out.println("i:" + i);
		
		
		// &, | => 발생안함
		int j = 3;
		if ((j++) < 0 & (j++) > -5) {
			System.out.println("j는 -5보다 크고 0보다 작다");
		}
		System.out.println("j:" + j);
		
		System.out.println("프로그램 종료");
	}
}
/*
▶ShortCircuit이란 논리연산자[AND, OR]을 나타내기 위해 부호[&&, ||]를 사용하는 것을 의미한다.
▶[&&, ||]와 [&, |]를 비교할 때, 둘은 최종적으로 같은 결과를 내지만 다른 과정을 거친다.
▶[&, |] : 연산자의 앞 조건식과 뒤 조건식을 둘 다 실행 시킨다.
▶[&& , ||] : 연산자의 앞 조건식의 결과에 따라 뒤 조건식의 실행 여부를 결정한다. 
▶이러한 논리연산자를 특별히 ShortCircuit이라 한다.
▶ShortCircuit에서는 [&&] 앞의 boolean 값이 false 일 때, [&&] 뒤를 굳이 실행하지 않음으로 
 불필요한 연산을 생략한다.
▶마찬가지로 [||] 앞의 boolean 값이 false 일 때만 뒤를 실행한다. (|| 앞쪽이 True 라면 뒤를 
 굳이 연산하지 않는다.)
*/

