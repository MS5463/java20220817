package ch06.lecture.p10answer;

import java.util.Arrays;

public class Test1복습필요 {
	static int[] arr = new int[3];
	static P445_Account[] accountArray = new P445_Account[3];
	
	public static void main(String[] args) {
		addNumber();
		System.out.println(Arrays.toString(arr));
		
		addAccount();
		System.out.println(Arrays.toString(accountArray));
	}
	
	private static void addAccount() {
		P445_Account a = new P445_Account("3", "3", 3);
		System.out.println(System.identityHashCode(a));
		accountArray[0] = a;
	}
	
	private static void addNumber() {
		arr[2] = 100;
	}
}
