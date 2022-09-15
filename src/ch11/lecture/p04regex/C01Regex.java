package ch11.lecture.p04regex;

public class C01Regex {
	public static void main(String[] args) {
		// regular expression(regex)
		// 정규표현식, 정규식표현
		// 문자열의 패턴을 표현하는 코드(문자열)
		
		String str1 = "a";
		
		// 하나의 문자
		String pattern1 = "a";
		
		System.out.println(str1.matches(pattern1));// True
		
		
		String s2 = "b";
		String p2 = "b";
		
		System.out.println(s2.matches(p2));// True
		
		
		String s3 = "bb";
		String p3 = "b";
		
		System.out.println(s3.matches(p3));// False
		
		
		String s4 = "bbb";
		String p4 = "b+"; // + : 한개 이상
		
		System.out.println(s4.matches(p4));// True
		System.out.println(s3.matches(p4));// True
		System.out.println(s2.matches(p4));// True	
		System.out.println("".matches(p4));// False
		
		
		String p5 = "b*"; // * : 0개 이상
		
		System.out.println("bbb".matches(p5));// True
		System.out.println("bb".matches(p5));// True
		System.out.println("b".matches(p5));// True
		System.out.println("".matches(p5));// True
		
		
		String p6 = "dog";
		
		System.out.println("dog".matches(p6));// True
		
		
		String p7 = "do+g";
		
		System.out.println("dog".matches(p7));// True
		System.out.println("doooooog".matches(p7));// True
		
		
		String p8 = "[abcd]"; // [] : 안에 나열된 문자 중 하나
		
		System.out.println("a".matches(p8));// True
		System.out.println("b".matches(p8));// True
		System.out.println("c".matches(p8));// True
		System.out.println("e".matches(p8));// False
		System.out.println("A".matches(p8));// False
		
		
		String p9 = "[a-c]";
		
		System.out.println("a".matches(p9));// True
		System.out.println("b".matches(p9));// True
		System.out.println("c".matches(p9));// True
		System.out.println("A".matches(p9));// False
		System.out.println("d".matches(p9));// False
		
		
		String p10 = "[a-cA-C]"; // [abcABC]
		
		System.out.println("a".matches(p10));// True
		System.out.println("A".matches(p10));// True
		System.out.println("d".matches(p10));// False
		System.out.println("abc".matches(p10));// False	
		System.out.println("abc".matches("[a-c]+"));// True
		
		
		String p11 = "[^abcdefghijkl]"; // [^] : 제외하고
		
		System.out.println("a".matches(p11));// False
		System.out.println("m".matches(p11));// True
		System.out.println("0".matches(p11));// True
		
		
		String p12 = "[^a-z]";
		
		System.out.println("a".matches(p12));// False
		System.out.println("A".matches(p12));// True
		System.out.println("9".matches(p12));// True
		
		
		String p13 = "d[^o]+g";
		
		System.out.println("dog".matches(p13));// False
		System.out.println("dag".matches(p13));// True
		System.out.println("dabcdefg".matches(p13));// True
		
		// 수량
		// + : 1개 이상
		// * : 0개 이상
		// ? : 0개 또는 1개
		// {n} : n개
		// {n,} : n개 이상
		// {n, m} : n개 이상 m개 이하
		
		String p14 = "do+g";
		
		System.out.println("dog".matches(p14));// True
		System.out.println("doooooooooooog".matches(p14));// True
		
		
		String p15 = "do*g";
		
		System.out.println("dog".matches(p15));// True
		System.out.println("doooog".matches(p15));// True
		System.out.println("dg".matches(p15));// True
		
		
		String p16 = "do?g";
		
		System.out.println("dog".matches(p16));// True
		System.out.println("dg".matches(p16));// True
		System.out.println("doog".matches(p16));// False
		
		
		String p17 = "do{2}g";
		
		System.out.println("doog".matches(p17));// True
		System.out.println("dog".matches(p17));// False
		System.out.println("dooog".matches(p17));// False
		
		// 기호
		// . : 모든 글자
		// \d : [0-9] (digit)
		// \w : [a-zA-Z0-9_] (word character)
		// \s : 공백(스페이스, 엔터, 탭) 
		// ^ : 한 줄의 시작
		// $ : 한 줄의 끝
		
		String p18 = ".";
		
		System.out.println("a".matches(p18));// True
		System.out.println(" ".matches(p18));// True
		System.out.println("0".matches(p18));// True
		System.out.println("".matches(p18));// False
		System.out.println("aa".matches(p18));// False
		System.out.println("aa".matches(".{2}"));// True
		
		
		String p19 = "\\d"; // java에서 \는 \\로 작성
		
		System.out.println("0".matches(p19));// True
		System.out.println("5".matches(p19));// True
		System.out.println("a".matches(p19));// False
		System.out.println("".matches(p19));// False
		System.out.println("91".matches(p19));// False
		
		
		String p20 = "\\d{8}";
		
		System.out.println("19550101".matches(p20));// True
		System.out.println("550101".matches(p20));// False
		
		
		String p21 = "\\d{4}-?\\d{2}-?\\d{2}";
		
		System.out.println("19550101".matches(p21));// True
		System.out.println("1955-01-01".matches(p21));// True
		System.out.println("195501-01".matches(p21));// True
		
		// () : 그룹
		// | : or 또는
		
		String p22 = "(dog|cat)";
		
		System.out.println("dog".matches(p22));// True
		System.out.println("cat".matches(p22));// True
		
		
		String p23 = "(\\d{4}|\\d{2})-?\\d{2}-?\\d{2}";
		
		System.out.println("19550101".matches(p23));// True
		System.out.println("550101".matches(p23));// True
		System.out.println("9550101".matches(p23));// False
		System.out.println("1955-01-01".matches(p23));// True
		System.out.println("55-01-01".matches(p23));// True
		
		
		String p24 = "(dog)+";
		
		System.out.println("dog".matches(p24));// True
		System.out.println("dogdog".matches(p24));// True
		System.out.println("dogdo".matches(p24));// False
		
		// \. : . (dot)
		
		String p25 = "\\.";
		
		System.out.println("a".matches(p25));// False
		System.out.println(".".matches(p25));// True
		
		
		String p26 = "www\\.[a-z]+\\.com";
		
		System.out.println("www.daum.com".matches(p26));// True
		System.out.println("daum.com".matches(p26));// False
		System.out.println("www.daumcom".matches(p26));// False
	}
}