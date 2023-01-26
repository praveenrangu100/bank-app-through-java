package bankapp;
public abstract class Customer {
	private String firstName,lastName,address;
	private Account account;
	private long custID;
	private static int count;
	public Customer() {
		count++;
		firstName="customername";
		lastName="surname";
		address="locality";
		custID=count;
		account = new Account();
	}
	public Customer(String firstName,String lastName,String address,Account account) {
		count++;
		custID=count;
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.account=account;
	}
	public Customer(long custID,String firstName,String lastName,String address,Account account) {
		count++;
		this.custID=custID;
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.account=account;
		}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public long getCustID() {
		return custID;
	}
	public String getName() {
		return firstName+" "+lastName;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account=account;
	}
	public String toString() {
		return  "Customer[custID="+custID+", FirtName ="+ firstName+ ", lastname ="+lastName+", Address ="+address+", account="+account+"]";
	}
}
