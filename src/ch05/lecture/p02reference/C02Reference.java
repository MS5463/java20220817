package ch05.lecture.p02reference;

public class C02Reference {
	public static void main(String[] args) {
		int[] a = {3, 4, 5};
		int[] b = {99, 100, 101};
		
		a[0] = 33;//a가 가르키고 있는 0번 인텍스에는 3에서 33으로 할당되게 되었음
		
		System.out.println(a[0]);
		
		int[] c = a;//a는 내부 객체를 가르키는 주소를 가지고 있다
					//heap 메모리에는 바뀌지 않으며 c는 a와 같은 주소를 가진다(주소가 똑같고 heap 메모리의 객체
					//를 공유한다) 
		c[2] = 1000;
		System.out.println(a[2]);//1000이 출력됨
	}
}
