package ch10.lecture.p02try;

public class C08MultiCatch {
	public static void main(String[] args) {
		String[] arr = {"삼백"};
		
		try {
			int a = Integer.parseInt(arr[0]);	
		
			System.out.println(a);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("exception 발생1");
		} catch (NumberFormatException e) {
			System.out.println("exeception 발생2");
		}
		
		try {
			int a = Integer.parseInt(arr[0]);
			
			System.out.println(a);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("exception 발생3");
		}
		
		try {
			int a = Integer.parseInt(arr[0]);
			
			System.out.println(a);
		} catch (RuntimeException e) {
			System.out.println("exception 발생4");
		}
		
		try {
			int a = Integer.parseInt(arr[0]);
			
			System.out.println(a);
		} catch (Exception e) {
			System.out.println("exception 발생!!!");
		}
	}
}
