package ch16.book_16;

import java.util.Arrays;
import java.util.List;

public class P800_FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동", "신용권", "감자바", "신용권", "신민철");
		
		names.stream()
			.distinct()//.....중복 제거
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		names.stream()
			.filter(n -> n.startsWith("신"))//.....필터링
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		names.stream()
			.distinct()								//┐
			.filter(n -> n.startsWith("신"))		//├─중복 제거 후 필터링
			.forEach(n -> System.out.println(n));	//┘
	}
}
