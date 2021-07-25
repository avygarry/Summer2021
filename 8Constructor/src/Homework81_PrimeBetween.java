
public class Homework81_PrimeBetween {
	public static void main(String[] args) {
		for (int x = 25; x <= 2000; x++) {
			boolean primeNumber = isPrime(x);
			if(primeNumber == true) {
				System.out.println(x + " is a prime number");
			}
		}
	}

	public static boolean isPrime(int aNumber) {
		for (int index = 2; index < aNumber; index++) {
			if (aNumber % index == 0) {
				return false;
			}
		}
		return true;
	}
}
