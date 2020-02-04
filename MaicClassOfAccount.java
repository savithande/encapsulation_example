package encaplsulation;

public class MaicClassOfAccount {
	public static void main(String[] args) {
		Account account = new Account();
		AccountTransaction transaction = new AccountTransaction();
		
		transaction.deposit(500000, account);
		transaction.deposit(-50000, account);
	}

}
