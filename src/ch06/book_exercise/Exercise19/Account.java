package ch06.book_exercise.Exercise19;

public class Account {
	static final int MIN_BALANCE = 0;
	final static int MAX_BALANCE = 1000000;
	//순서는 상관 없음
	
	private int balance = 0;
	
	public void setBalance(int balance) {
		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
	}
	
	public int getBalance() {
		return this.balance;
	}	
} 
