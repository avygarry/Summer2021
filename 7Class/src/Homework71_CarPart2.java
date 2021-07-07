/**
 * Chapter 7 Homework 1 Part 2
 * This gives values to them and prints them
 * @author Avy
 */
public class Homework71_CarPart2 {
	public static void main(String[] args) {
		Homework71_CarPart1 E63S = new Homework71_CarPart1();
		E63S.make = "Mercedes Benz";
		E63S.model = "E 63S 4Matic+";
		E63S.year = 2021;
		E63S.NewOrOld = "New";
		E63S.price = 149915;
		E63S.MPG = 19;
		
		Homework71_CarPart1  S500 = new Homework71_CarPart1();
		S500.make = "Mercedes Benz";
		S500.model = "S 500 4Matic";
		S500.year = 2021;
		S500.NewOrOld = "New";
		S500.price = 124990;
		S500.MPG = 19;
		
		Homework71_CarPart1 R8 = new Homework71_CarPart1();
		R8.make = "Audi";
		R8.model = "R8";
		R8.year = 2021;
		R8.NewOrOld = "New";
		R8.price = 221195;
		R8.MPG = 18;
		
		System.out.println(E63S.make);
		System.out.println(E63S.model);
		System.out.println(E63S.year);
		System.out.println(E63S.NewOrOld);
		System.out.println(E63S.price);
		System.out.println(E63S.MPG);
		System.out.println("");
		System.out.println(S500.make);
		System.out.println(S500.model);
		System.out.println(S500.year);
		System.out.println(S500.NewOrOld);
		System.out.println(S500.price);
		System.out.println(S500.MPG);
		System.out.println("");
		System.out.println(R8.make);
		System.out.println(R8.model);
		System.out.println(R8.year);
		System.out.println(R8.NewOrOld);
		System.out.println(R8.price);
		System.out.println(R8.MPG);
		
	}

}
