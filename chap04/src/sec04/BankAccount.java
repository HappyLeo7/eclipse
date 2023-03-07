package sec04;

public class BankAccount {
	int balance;

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

	public int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;

	}

	public void printMyAccount() {

	}
}
