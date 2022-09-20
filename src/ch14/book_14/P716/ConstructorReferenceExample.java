package ch14.book_14.P716;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferenceExample {
	public static void main(String[] args) {
		Function<String, Member> function1 = Member :: new;//.....생성자 참조(Member Line 10 ~ Line 13)
		Member member1 = function1.apply("angel");
//						 └       매개값1개       ┘
		
		BiFunction<String, String, Member> function2 = Member :: new;//.....생성자 참조(Member Line 14 ~ Line 18)
		Member member2 = function2.apply("신천사", "angel");
//						 └             매개값2개           ┘
	}
}
