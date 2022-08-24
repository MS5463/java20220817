package ch05.lecture.p02reference;

public class C03Reference {
	public static void main(String[] args) {
		int[] a = {3, 4, 5};
		int [] b = a;//b는 a의 주소와 같은 값을 가짐
		
		System.out.println(b[2]); //5
		
		a = new int[] {9, 8, 7};  //	a는 새로운 객체(instance)를 가지고 주소도 바뀐다.
		
		System.out.println(b[2]); //5	원래 선언된 a의 주소를 가짐(a는 현 시점에서 다른 주소를 가진다.)
	}				
}
