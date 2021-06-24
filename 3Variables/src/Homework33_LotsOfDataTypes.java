/**
 * Chapter 3 Homework 3
 * 
 * @author Avy
 */
public class Homework33_LotsOfDataTypes {
	public static void main(String[] args) {
		byte LowByte = -128;
		byte HighByte = 127;
		short LowShort = -32768;
		short HighShort = 32767;
		int LowInt = -2147483648;
		int HighInt = 2147483647;
		long LowLong = -9223372036854775808l;
		long HighLong = 9223372036854775807l;
		float LowFloat = Float.MIN_VALUE;
		float HighFloat = Float.MAX_VALUE;
		double LowDouble = Double.MIN_VALUE;
		double HighDouble = Double.MAX_VALUE;
		boolean LowBoo = false;
		boolean HighBoo = true;
		System.out.println("The lowest Byte is " + LowByte);
		System.out.println("The highest Byte is " + HighByte);
		System.out.println("The lowest Short is " + LowShort);
		System.out.println("The highest Short is " + HighShort);
		System.out.println("The lowest Int is " + LowInt);
		System.out.println("The highest Int is " + HighInt);
		System.out.println("The lowest Long is " + LowLong);
		System.out.println("The highest Long is " + HighLong);
		System.out.println("The lowest Float is " + LowFloat);
		System.out.println("The highest Float is " + HighFloat);
		System.out.println("The lowest Double is " + LowDouble);
		System.out.println("The highest Doublee is " + HighDouble);
		System.out.println("The lowest Boolean is " + LowBoo);
		System.out.println("The highest Boolean is " + HighBoo);
	}
}
