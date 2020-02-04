package encaplsulation;

public class Account {
	
	String name = "xyz";
	private long accountNum = 1237648762;
	private double balance = 100000;
	
	public long getaccountNum() {
		return accountNum;
	}
	public double getbalance() {
		return balance;
	}
	
	public void setaccountNum(long accountNum) {
		this.accountNum = accountNum;
	}
	public void setbalance(double balance) {
		this.balance = balance;
	}
	
}
