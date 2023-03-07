package sec06;

public class BankAccount01 {
	String accNumber; // 계좌번호
	String ssNumber; // 주민번호
	int balance; // 예금잔액

	public BankAccount01() {
	}

	public BankAccount01(String acc) {
		accNumber = acc;
	}

	public BankAccount01(String ss, int bal) {
		ssNumber = ss;
		balance = bal;

	}

	public int deposit(int amount) {
		balance += amount;
		System.out.println("입금 : " + balance);
		return balance;
	}

	public int withdraw(int amount) {
		balance -= amount;
		System.out.println("출금 : " + balance);
		return balance;
	}

	public void checkMyBalance() {
		System.out.println("계좌번호: " + accNumber);
		System.out.println("주민번호: " + ssNumber);
		System.out.println("잔   액: " + balance + '\n');
//		return balance;

	}

	public void printMyAccount() {
		System.out.println("11-12-13");
		System.out.println("990990-90909090");

	}
}
