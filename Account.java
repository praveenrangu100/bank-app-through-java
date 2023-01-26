package bankapp;

public class Account {
	private static int nextID=0;
	private String accNumber="SBIN00";
	private String name;
	private int balance=0;
	public Account() {
		this.accNumber=this.accNumber+nextID;
		this.name="name";
		balance=0;
		nextID++;	
	}
	public Account(String accNumber,String name) {
		this.accNumber=accNumber;
		this.name=name;
		balance=0;
		nextID++;
	}
	public Account(String accNumber,String name,int balance) {
		this.accNumber=accNumber;
		this.name=name;
		this.balance=balance;
		nextID++;
	}
	public String getAccNumber() {
		return accNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance=balance;
	}
	public int credit(int amount) {
		balance+=amount;
		return balance;
	}
	public int debit(int amount) {
		if(amount<=balance)
				balance-=amount;
		else
			System.out.println("Amount exceeded balance");
	return balance;
	}
	public int transferTo(Account another,int amount) {
		this.debit(amount);
		another.credit(amount);
		return balance;
	}
	public String toString() {
		return "Amount[account number="+accNumber+", name="+name+", balance="+balance+"]";
	}
}
