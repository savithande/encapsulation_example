package encaplsulation;

public class AccountTransaction {
	public void deposit(int ammount,Account a1) {
		if (ammount > 0) {
			double b1 = a1.getbalance();
			b1 = b1 + ammount;
			a1.setbalance(b1);
		}
		else {
			System.out.println("invalid");
		}
	}

}
