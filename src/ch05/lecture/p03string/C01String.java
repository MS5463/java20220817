package ch05.lecture.p03string;

public class C01String {
	//그림 : 06문자열.png
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		
		System.out.println(a == b); // true
		
		String s1 = "java";
		String s2 = "java";
		String s3 = "ja";
		String s4 = "va";
		String s5 =  s3 + s4; //"java"
		
		System.out.println(s1 == s2); // true 가르키고 있는 객체가 같음
		System.out.println(s1 == s5); //참고값이 다름
		
		System.out.println(System.identityHashCode(s1));//s1와 s2 는 id값이 같음
		System.out.println(System.identityHashCode(s2));
		
		System.out.println(System.identityHashCode(s3));//s1와 s2 는 id값이 다름
		//string content 비교
		System.out.println(s1.equals(s5));
		System.out.println(s1.contentEquals(s5));
	}
}
