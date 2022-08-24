package ch05.book_05;

public class P154_ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] { 83, 90, 87 };//배열 scores 선언, {83, 90, 87}
		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}//배열을 전부 합친다.
		System.out.println("총합 : " + sum1);
		
		//리턴의 총합을 sum2에 저장
					
		int sum2 = add( new int[] { 83, 90, 87 } );
		System.out.println("총합 : " + sum2);
		System.out.println();
	}
	
private static int add(int[] scores) {
	int sum = 0;
	for (int i = 0; i < 3; i++) {
		sum += scores[i];
	}
	return sum;

	}//총합을 계산해서 리턴하는 메소드
}
//154p