package ch04.book_04;

public class P133_ContinueExample {
	public static void main(String[] args) {
		for (int i = 0; i<=10; i++) {
			if (i%2 != 0) {// 2로 나눈 나머지가 0이 아닐 경우, 즉 홀수인 경우
				continue;// line 5에 i++로
			}
			System.out.println(i);// 홀수는 실행되지 않는다
		}
	}
}
//133p