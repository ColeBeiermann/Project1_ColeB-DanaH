
public abstract class Customer{

	private String customerCode;
	private char type;
	private String primaryContact;
	
	public Customer(String customerCode, String primaryContact, char type) {
		this.customerCode = customerCode;
		this.type = type;
		this.primaryContact = primaryContact;
	}
	
	public String getCustomerCode() {
		return customerCode;
	}
	
	public char getType() {
		return type;
	}
	
	public String getPrimaryContact() {
		return primaryContact;
	}
	
}
