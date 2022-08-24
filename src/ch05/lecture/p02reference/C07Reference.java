package ch05.lecture.p02reference;

public class C07Reference {
	public static void main(String[] args) {
		int[] a = {9, 8, 7};//01.9, 8, 7값을 a가 가짐
		System.out.println(a[0]);//02.9 출력
		
		a = changeItems(a);//03 method를 오른쪽부터 실행(30 실행)
		
		System.out.println(a[0]);//3이 출력됨
	}
	
	public static int[] changeItems(int[] arr) {//04 arr의 a값 전달
		System.out.println(arr[0]);//9가 출력됨
		arr = new int[] {3, 4, 5};//새 instance값 전달
		return arr;//30이 리턴됨
 	}
}
