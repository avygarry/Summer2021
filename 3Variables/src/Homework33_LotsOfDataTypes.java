/**
 * Chapter 3 Homework 3
 * For this homework I have to add a bunch of variables and print them.
 * @author Avy
 */
public class Homework33_LotsOfDataTypes {
	public static void main(String[] args) {
		byte lowByte = -128;
		byte highByte = 127;
		short lowShort = -32768;
		short highShort = 32767;
		int lowInt = -2147483648;
		int highInt = 2147483647;
		long lowLong = -9223372036854775808l;
		long highLong = 9223372036854775807l;
		float lowFloat = Float.MIN_VALUE;
		float highFloat = Float.MAX_VALUE;
		double lowDouble = Double.MIN_VALUE;
		double highDouble = Double.MAX_VALUE;
		boolean lowBoo = false;
		boolean highBoo = true;
		System.out.println("The lowest Byte is " + lowByte);
		System.out.println("The highest Byte is " + highByte);
		System.out.println("The lowest Short is " + lowShort);
		System.out.println("The highest Short is " + highShort);
		System.out.println("The lowest Int is " + lowInt);
		System.out.println("The highest Int is " + highInt);
		System.out.println("The lowest Long is " + lowLong);
		System.out.println("The highest Long is " + highLong);
		System.out.println("The lowest Float is " + lowFloat);
		System.out.println("The highest Float is " + highFloat);
		System.out.println("The lowest Double is " + lowDouble);
		System.out.println("The highest Double is " + highDouble);
		System.out.println("The lowest Boolean is " + lowBoo);
		System.out.println("The highest Boolean is " + highBoo);
	}
}
