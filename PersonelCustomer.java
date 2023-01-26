package bankapp;

public class PersonelCustomer extends Customer {
	private String homePhone;
	private String workPhone;
	public PersonelCustomer() {
		super();
		homePhone="+916304284868";
		workPhone="+919515218758";
	}
	public PersonelCustomer(String firstName,String lastName,String address,Account account,String email,String phoneNum) {
		super(firstName,lastName,address,account);
		this.homePhone=email;
		this.workPhone=phoneNum;
	}
	public PersonelCustomer(long custID,String firstName,String lastName,String address,Account account,String email,String phoneNum) {
		super(custID,firstName,lastName,address,account);
		this.homePhone=email;
		this.workPhone=phoneNum;
	}
	public String getEmail() {
		return homePhone;
	}
	public void setEmail(String email) {
		this.homePhone=email;
	}
	public String getPhoneNum() {
		return workPhone;
	}
	public void setPhoneNum(String phoneNum) {
		this.workPhone=phoneNum;
	}
	public String toString() {
		return "Personel Customer["+super.toString()+"Home phone: "+homePhone+", work phone: "+workPhone+"]";
	}
}
