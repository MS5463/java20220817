package ch05.lecture.p02reference;

public class C04Reference {
	public static void main(String[] args) {
		int a = 3;//먼저 실행됨     01
		printVar(a); //01.a가 자신의 값인 3을 넘겨줌   
		int b = 5;//
		printVar(b); //02.b가 자신의 값인 5을 넘겨줌 
		
		int[] c = {9, 1, 2};//03.c의 참조값(instance)은 23이라는 id를 가짐 
		printArray(c);//이 코드 실행시 c가 가지고 있는 참조 값이 넘겨줌
		
		int[] d = {99, 88, 77};//04.d의 참조값(instance)은 25이라는 id를 가짐 
		printArray(d);//이 코드 실행시 d가 가지고 있는 참조 값이 넘겨줌 07 30을 가짐
	}
	private static void printVar(int a) {//6번에서 넘어옴 3을 받음
		System.out.println(a);				//8번 5가 넘어옴    02 a는 3의 값을 가짐 04 5 가 실행
	}
	private static void printArray(int[] c) {//참조값 c 가 넘겨저 같은 instance을 가짐 06참조값 28을 가짐9ㅏ출력		System.out.println(c[0]);//9
	}
}
//디버그 모드 참조