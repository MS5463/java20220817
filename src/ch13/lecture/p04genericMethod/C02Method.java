package ch13.lecture.p04genericMethod;

import java.util.Arrays;
import java.util.List;

public class C02Method {
	public static void main(String[] args) {
		List<String> list1 = Arrays.<String>asList("java", "Spring", "jsp");
		List<Integer> list2 = Arrays.<Integer>asList(99, 100, 200);
		
		List<String> list3 = Arrays.asList("topgun", "thor", "iceman");
		List<Integer> list4 = Arrays.asList(99, 200, 300);
	}
}
