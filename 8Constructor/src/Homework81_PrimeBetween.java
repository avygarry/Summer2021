
public class Homework81_PrimeBetween {
	public static void main(String[] args) {
		System.out.println(prime);
	}

	public static boolean isPrime(int aNumber) {
		for (int index = 25; index < 2000; index++) {
			for (int x = 1; x < index; x++) {
				if (index % x != 0) {
					boolean prime = false;
					
				} else {
					boolean prime = true;
				}
			}
		}
		return prime;
	}

}
