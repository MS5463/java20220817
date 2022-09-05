package ch10.book_10;

public class P447_AccountExample {
	public static void main(String[] args) {
		P445_Account account = new P445_Account();
		//에금하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		//출금하기
		try {
			account.withdraw(30000);
		} catch (P444_BalanceInsufficientException e) {
			String message = e.getMessage();//.....예외 메시지 얻기
			System.out.println(message);
			System.out.println();
			e.printStackTrace();//.....예외 추적 후 출력
		}
	}
}
