package sec04;

import java.util.Scanner;

public class BankAccountDemo {

	public static void main(String[] args) {
		Scanner mony = new Scanner(System.in);
		BankAccount myWon = new BankAccount();
//		myWon.balance = mony.nextInt();
//		myWon.balance = 0; newBankAccount에서 0을 선언해줌
		String mm = "";
		System.out.println("원하시는업무를 선택해주세요\n(1.은행업무,1.은행,1.업무)");
		do {
			mm = mony.nextLine();
			if (mm.equals("1") || mm.equals("은행업무") || mm.equals("은행") || mm.equals("업무")) {

				System.out.println("1.입금,2.출금,3.잔액조회");
				mm = mony.nextLine();

				if (mm.equals("3") || mm.equals("2") || mm.equals("1") || mm.equals("입금") || mm.equals("출금")
						|| mm.equals("잔액") || mm.equals("잔액조회")) {

				} else {
					System.out.println("원하시는업무를 선택해주세요\n(3.은행업무,3.은행,3.업무)");
				}
				if (mm.equals("입금") || mm.equals("1")) {
					System.out.println("입금 금액: ");
					myWon.deposit(mony.nextInt());
					myWon.checkMyBalance();
					System.out.println("원하시는업무를 선택해주세요\n(1.은행업무,1.은행,1.업무)");
				} else

				if (mm.equals("출금") || mm.equals("2")) {
					System.out.println("출금 금액: ");
					myWon.withdraw(mony.nextInt());
					myWon.checkMyBalance();
					System.out.println("원하시는업무를 선택해주세요\n(1.은행업무,1.은행,1.업무)");
				} else

				if (mm.equals("잔액조회") || mm.equals("3") || mm.equals("잔액")) {
					myWon.checkMyBalance();
					System.out.println("원하시는업무를 선택해주세요\n(1.은행업무,1.은행,1.업무)");
//					System.out.println("원하시는업무를 선택해주세요\n(2.은행업무,2.은행,2.업무)");
				} else {
				}
			} else {
				System.out.println("원하시는업무를 선택해주세요\n(3.은행업무,3.은행,3.업무)");
			}

		} while (!mm.equals("종료"));
		{

			System.out.println("종료");
		}

	}

}