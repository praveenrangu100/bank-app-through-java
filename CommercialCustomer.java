package bankapp;

public class CommercialCustomer extends Customer {
	private String contactPhone;
	private String conPerson;
	public CommercialCustomer() {
		super();
		contactPhone="";
		conPerson="";
	}
	public CommercialCustomer(String firstName,String lastName,String address,Account account,String contactPhone,String conPerson) {
		super(firstName,lastName,address,account);
		this.contactPhone=contactPhone;
		this.conPerson=conPerson;
	}
	public CommercialCustomer(long custID,String firstName,String lastName,String address,Account account,String contactPhone,String conPerson) {
		super(custID,firstName,lastName,address,account);
		this.contactPhone=contactPhone;
		this.conPerson=conPerson;
	}
	public String getPhoneNum() {
		return contactPhone;
	}
	public void setPhoneNum(String phoneNum) {
		this.contactPhone=phoneNum;
	}
	public String getConPerson() {
		return conPerson;
	}
	public void setConPerson(String conPerson) {
		this.conPerson=conPerson;
	}
	
	public String toString() {
		return "Commercial Customer["+super.toString()+"contat phone: "+contactPhone+", Contact Person: "+conPerson+"]";
	}
}
