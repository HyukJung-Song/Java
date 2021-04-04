
import java.util.Arrays;
import java.util.Random;

public class A {

	public static void main(String[] args) {

		factorial(5);
	}
	
	// 5! = 5 * 4 * 3 * 2 * 1
	public static int factorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	
}
