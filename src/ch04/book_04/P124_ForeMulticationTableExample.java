package ch04.book_04;

public class P124_ForeMulticationTableExample {
	public static void main(String[] args) {
		for (int m = 2; m<=9; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n = 1; n<=9; n++) {
			System.out.println(m + " × " + n + " = " + (m*n));
			} 
		}
	}
}
//124p