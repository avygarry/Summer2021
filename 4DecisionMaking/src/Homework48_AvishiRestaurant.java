import java.util.Scanner;

public class Homework48_AvishiRestaurant {
	
	public static int readUserIntInput(String aInputMsg) {
		System.out.print(aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

	public static void main (String[] arg) {
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("We sell Pizaazzzzzzzzzz");
		System.out.println("Here are the Pizzaz we sell");
		System.out.println("Goat Cheese Pizza - $15");
		System.out.println("This Cheese is so fresh, you'll fart!");
		System.out.println("Chicken Feet Pizza - $9");
		System.out.println("Chicken is way too expensive for this restaurant, and I know a guy who sells chicken feet soooo.");
		System.out.println("Pure Vegitarian Venus Fly Trap Pizza - $80");
		System.out.println("We sent some dudes to the Amazon Rainforest and don't Worry! Most came back!");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Appetizers");
		System.out.println("Buffalo Wings - $7");
		System.out.println("Made from the wings of the great buffalo!");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Deserts");
		System.out.println("Brownies - $24");
		System.out.println("These brownies are fresh from the toilet! We are still hiring pro poopers.");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("There is 20% tax. Government gets 6%, we get the rest cause we broke.");
		System.out.println("--------------------------------------------------------------------------------------");
		int GCpizza = readUserIntInput("How many Goat Cheese Pizzas would you like to consume: ");
		int CFpizza = readUserIntInput("How many Chicken Feet Pizzas would you like to consume: ");
		int VFTpizza = readUserIntInput("How many Vegitarian Venus Fly Trap Pizzas would you like to consume: ");
		int BW = readUserIntInput("How many packs of Buffalo Wings would you like to consume: ");
		int Brownies = readUserIntInput("How many Brownies would you like to consume: ");

}
}
