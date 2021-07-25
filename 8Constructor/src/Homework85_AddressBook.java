
public class Homework85_AddressBook {
	public static void main(String[] args) {
		Homework85_Contact avy = new Homework85_Contact();
		avy.setFirstName("Avy");
		avy.setLastName("Garothaya");
		avy.setEmailId("avy.garry@gmail.com");
		avy.setCellPhoneNumber("571-485-1596");
		avy.setHomePhoneNumber("N/A");
		avy.setWorkPhoneNumber("N/A");
		avy.setNotes("Smart Guy");

		Homework85_Contact dhyeya = new Homework85_Contact();
		dhyeya.setFirstName("Dhyeya");
		dhyeya.setLastName("Chandi");
		dhyeya.setEmailId("dhyeya.chandi@gmail.com");
		dhyeya.setCellPhoneNumber("N/A");
		dhyeya.setHomePhoneNumber("N/A");
		dhyeya.setWorkPhoneNumber("N/A");
		dhyeya.setNotes("Another smart Guy");

		Homework85_Contact[] contacts = new Homework85_Contact[2];
		contacts[0] = avy;
		contacts[1] = dhyeya;

		String name = ReadUserInput.readUserStringInput("Enter a name: ");

		for (Homework85_Contact contact : contacts) {
			if (name.equalsIgnoreCase(contact.getFirstName())) {
				System.out.println("-------------------------------------------------");
				System.out.println(contact.getFirstName() + " " + contact.getLastName());
				System.out.println(contact.getEmailId());
				System.out.println(contact.getCellPhoneNumber());
				System.out.println(contact.getHomePhoneNumber());
				System.out.println(contact.getWorkPhoneNumber());
				System.out.println(contact.getNotes());
				System.out.println("-------------------------------------------------");
			}
			
		}
	}

}
