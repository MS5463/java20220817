package ch06.book_06.P227;

public class Calculator {
	int plus(int x, int y) {//02.호출 line 10 => line 04
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {//01.호출 line 16 => line 09
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);
		println("실행결과: " + result);
	}
	
	void println(String message) {//03.호출 line 17 => line 20
		System.out.println(message);
	}
}
