package ch16.lecture.p02stream;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class C13Collect {
	public static void main(String[] args) {
		List<Integer> list1 = IntStream.range(1, 100)
			.filter(n -> n % 2 == 0)
			.boxed()
			.collect(Collectors.toList());
		
		System.out.println(list1);
	}
}
