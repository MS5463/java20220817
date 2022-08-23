package ch04.lecture.p1control;
	public class C09For_실습필요 {
		public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("========01========");	
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("========02========");
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("========03========");
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= 0; j--) {
				System.out.print(j);
			}System.out.println();
		}
		System.out.println("========04========");
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("========05========");
		for (int i = 2; i < 7; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("========06========");
		int a = 0;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((a++));
			}
			System.out.println();
		}		
		System.out.println("========07========");
		for (int c = 0; c < 5; c++) {
			for (int j = 0; j <= c ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("========08========");	
		for (int q = 0; q < 5; q++) {
			for (int j = 5; j > q ; j--) {
				System.out.print("*");
			}
			System.out.println(" ");
			}
		System.out.println("========09========");
		String s = " ";
		for (int q = 0; q < 5; q++) {
			 
			for (int j = 5; j > q ; j--) {
				System.out.print("*");
				
			}System.out.println(s);
		}
		System.out.println("========10========");
		
		System.out.println("========11========");
		int c = 0;
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((c++)%10);
			}
			System.out.println();
		}}
		
	
}



