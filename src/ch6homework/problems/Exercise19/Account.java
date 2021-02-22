package ch6homework.problems.Exercise19;

public class Account {

	
	static int balance = 0;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;


	public static int getBalance() {
		return balance;
	}
	
	public static void setBalance(int money) {
		if(money > MIN_BALANCE && money < MAX_BALANCE) {
			 balance = money;
		}
	}
	
}
