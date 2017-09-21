package homework2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.cinco.payroll.Employee;

public class phaseII {

	public static List<Customer> parseDataFile(){
		List<Customer> result = new ArrayList<Customer>();
		try {
			File f = new File("data/Customers.dat");
			Scanner s = new Scanner(f);
			while(s.hasNext()) {
				String line = s.nextLine();
				if(!line.trim().isEmpty()) {
					Customer customer0 = null;
					String Etokens[] = line.split(";");
					String customerCode = Etokens[1];
					String customerType = Etokens[2];
					String primaryContact = Etokens [3];
					String addressTokens[] = Etokens[4].split(",");
						String street = addressTokens[0];
						String city = addressTokens[1];
						String state = addressTokens[2];
						int zip = Integer.parseInt(addressTokens[3]);
						String country = addressTokens[4];
					Address address0 = new Address(street, city, state, zip, country);
					
					customer0 = new Customer(customerCode, customerType, primaryContact, address0);
							
					result.add(customer0);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
		
	public static List<Person> parseDataFile(){
		List<Person> result = new ArrayList<Person>();
		try {
			File f = new File("data/Persons.dat");
			Scanner s = new Scanner(f);
			while(s.hasNext()) {
				String line = s.nextLine();
				if(!line.trim().isEmpty()) {
					Person person0 = null;
					String Ptokens[] = line.split(";");
					String nameTokens[] = Ptokens[1].split(",");
						String lastName = nameTokens[0];
						String firstName = nameTokens[1];
					String addressTokens[] = Ptokens[2].split(",");
						String street = addressTokens[0];
						String city = addressTokens[1];
						String state = addressTokens[2];
						int zip = Integer.parseInt(addressTokens[3]);
						String country = addressTokens[4];
					Address address0 = new Address(street, city, state, zip, country);
					String email[] = Ptokens[3].spllt(",");
					
					person0 = new Person(lastName, firstName, street, address0);
					
					result.add(person0);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	public static List<Product> parseDataFile() {
		
	//Add "products" code
		
	}
	
	
	public static void main(String args[]) {
		
	//Add output code
	
	}
	
	
	
	
	
	
	}

