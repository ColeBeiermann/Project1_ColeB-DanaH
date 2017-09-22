

import java.util.List;


public class DataConverter {

	public static void main(String[] args) {
		
		// Create a FlatFileReader object
		FlatFileReader fr = new FlatFileReader();
		
		/* fr Reads data from the flat file;
		 * Creates Person objects; and
		 * Stores Person objects in a Person ArrayList
		 */
		List<Person> personList = fr.readPersons();
		
		// Write Person ArrayList into a Json file
		JsonWriter jWriter = new JsonWriter();
		jWriter.jsonConverter(personList);
		
		// Write Person ArrayList into an XML file
		 XMLWriter xmlWriter = new XMLWriter();
	     xmlWriter.xmlConverter(personList);
	}
}
