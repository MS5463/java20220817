package ch16.lecture.p02stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C21GropingBy {
	public static void main(String[] args) {
		Map<String, List<Integer>> map =IntStream.of(3, 5, 2 ,4, 9, 10)
			.boxed()
			.collect(Collectors.groupingBy((e) -> (e % 2 == 0) ? "짝수" : "홀수"));// 분류를 어떻해 할지 정함
		
		System.out.println(map);
	}
}
