package ch06.book_exercise.Exercise19;

public class Account {
	private static final int MIN_BALANCE = 0;
	private final static int MAX_BALANCE = 1000000;
	private int balance;
	
	
	}
	public void setBalance(int Balance) {
		if (0 <= Balance) {
			this.Balance = 0;
			return;
		} else if(Balance <= 1000000){
			this.Balance = 0;
			return;
		} else {
			this.Balance = Balance;
		}
	}
} 
