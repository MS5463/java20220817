package ch10.book_10;

public class P445_Account {
	private long balance;
	
	public P445_Account() { }
	
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws P444_BalanceInsufficientException{
		if (balance < money) {//				^사용자 정의 예외 떠넘기기
			throw new P444_BalanceInsufficientException("잔고부족:"+(money - balance)+" 모자람");//사용자 정의 예외 발생
		}
		balance -= money;
	}
}
