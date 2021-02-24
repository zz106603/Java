package ch10.exam06;

public class Example {

	public static void main(String[] args) {

		Account account = new Account();

		try {
			String ano = null;
			account.deposit(ano, 1000); //runtimeException이기 때문에 안붙여도 되긴 하지만 붙여야함.
		}catch(NoAccountException e) {
			System.out.println(e.getMessage()); 
		}

		String ano = "111-222-333";
		try {
			account.withdraw(ano, 1000);
			account.withdraw(ano, 10000000);
		} catch (NoAccountException e) {
			System.out.println(e.getMessage());
		} catch (BalanceLackException e) {
			System.out.println(e.getMessage());
		}



	}

}
