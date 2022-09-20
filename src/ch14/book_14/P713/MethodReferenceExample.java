package ch14.book_14.P713;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {
	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		//정적 메소드 참조
		operator = (x, y) -> Calculator.staticMethod(x, y);
		System.out.println("결과1: " + operator.applyAsInt(1, 2));//→ Line 14
		
		operator = Calculator :: staticMethod;
		System.out.println("결과2: " + operator.applyAsInt(3, 4));
		
		//인스턴스 메소드 참조
		Calculator obj = new Calculator();
		operator = (x, y) -> obj.instanceMethod(x, y);
		System.out.println("결과3: " + operator.applyAsInt(5, 6));//→ Line 22
		
		operator = obj :: instanceMethod;
		System.out.println("결과4: " + operator.applyAsInt(7, 8));
	}
}
