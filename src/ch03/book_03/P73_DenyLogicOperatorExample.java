package ch03.book_03;

public class P73_DenyLogicOperatorExample {
	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);	//true
		
		play = !play;
		System.out.println(play);	//false
		
		play = !play;
		System.out.println(play);	//true
	}
}
//73p