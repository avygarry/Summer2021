
public class Continue {
	public static void main(String[] args) {
		String[] names;
		names = new String[4];
		names[0] = "Avy";
		names[1] = "Karthik";
		names[2] = "Dhyeya";
		names[3] = "Dhruv";
		for (String name: names) {
			if (names[0].equalsIgnoreCase("Avy")) {
				System.out.println("True");
			}
		}
	}

}
