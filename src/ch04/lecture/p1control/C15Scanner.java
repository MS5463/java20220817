package ch04.lecture.p1control;

import java.util.Scanner;//중요

public class C15Scanner {
	public static void main(String[] args) {
		String src = "Hellow my javascript";
		Scanner scanner = new Scanner(src);
		
		String t1 = scanner.next();
		System.out.println(t1);//Hello
		
		String t2 = scanner.next();
		System.out.println(t2);//my
		
		String t3 = scanner.next();
		System.out.println(t3);//javascript
		
		
		String src2 = "123 456 789";
		scanner = new Scanner(src2);
		
		String t4 = scanner.next();
		System.out.println(t4);//string 123
//		System.out.println(t4 * 2); 불가능
		
		int i1 = Integer.valueOf(t4);
		System.out.println(i1);//int 123
		System.out.println(i1 * 2);//int 246
		
		int i2 = scanner.nextInt();
		System.out.println(i2);//456
		
		String src3 = "Hellow world\nHello java\nHello spring";//\n : new line
		System.out.println(src3);//Hello world 
								 //Hello java
								 //Hello spring
		
		scanner = new Scanner(src3);
		
		String line1 = scanner.nextLine();
		System.out.println(line1);//Hello world 
		
		String line2 = scanner.nextLine();
		System.out.println(line2);//Hello java
		
		String line3 = scanner.nextLine();
		System.out.println(line3);//Hello spring
		
		System.out.println("사용자 입력 받기");
		scanner = new Scanner(System.in);
		
		String input1 = scanner.next(); 
		
		System.out.println("입력한 첫번째 토큰 : " + input1);//키보드로 문장열 입력시 출력
		
		int input2 = scanner.nextInt();
		
		System.out.println("입력한 두번째 토큰 (정수) : " + input2);//키보드로 정수 입력시 출력
		
		scanner.nextLine();
		String input3 = scanner.next(); 
		System.out.println("입력한 한줄 : " + input3);//비어있는 String이 출력됨
	}
}
