package ch16.book_exercise;

import java.util.stream.Stream;

public class Exercise05 {
	public static void main(String[] args) {
		Stream.of("This is a java book",
				  "Lambda Expressions",
				  "Java8 supports lambda exressions")
				.filter((s) -> s.toUpperCase().contains("java".toUpperCase()))
				.forEach(e -> System.out.println(e));				
	}
}
// 대소문자와 상관없이 "java"라는 단어가 포함된 문자열만 필터링해서 출력하도록 할 것 
