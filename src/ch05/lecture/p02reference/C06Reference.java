package ch05.lecture.p02reference;

public class C06Reference {
	public static void main(String[] args) {
		int[] a = {9, 8};
		changeItem(a);
		
		System.out.println(a[0]);//9
	}
	
	public static void changeItem(int[] arr) {//a의 참조값이 전달됨
		System.out.println(arr[0]);
		arr = new int[] {3, 4};
	}
}
