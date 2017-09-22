
public class  Person {

	private int code;
	private String name;
	private String address;
	private String emailAddress;

	public Person(int code, String name, String address, String emailAddress) {
		this.code = code;
		this.name = name;
		this.address = address;
		this.emailAddress = emailAddress;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getAddress() {
		return address;
	}

	public String getName() {
		return name;
	}

	public int getCode() {
		return code;
	}


}
