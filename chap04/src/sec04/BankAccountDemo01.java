package sec04;

public class BankAccountDemo01 {

	public static void main(String[] args) {

		BankAccount kim = new BankAccount(); // BankAccount인스턴스 정의함
		System.out.println("[kim] ");
		kim.deposit(50000);
		kim.withdraw(10000);
		kim.checkMyBalance();

		BankAccount lee = new BankAccount();
		System.out.println("[lee]");
		lee.deposit(40000);
		lee.deposit(10000);
		lee.checkMyBalance();
	}

}
