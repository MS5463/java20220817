package ch04.lecture;
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
		for (int i = 0; i < 6; i++) {
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
		
		
		System.out.println("========07========");
		
		
		System.out.println("========08========");
		for (int c = 0; c < 5; c++) {
			for (int j = 0; j <= c ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("========09========");	
		for (int q = 0; q < 5; q++) {
			for (int j = 5; j > q ; j--) {
				System.out.println("*");
			}
			System.out.println(" ");
			}
		System.out.println("========10========");
		for (int i = 0; i < 5; i++) {	
			for (int j = 5; j > i ; j--) {	
				System.out.println();
			}
			System.out.println();
		    }
		System.out.println("========11========");
		
		System.out.println("========12========");
		int k = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((k++)%10);
			}
			System.out.println();
		}}
		
	
}


//
