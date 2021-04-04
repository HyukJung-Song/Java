
import java.util.Arrays;
import java.util.Random;

public class A {

	public static void main(String[] args) {


		int result = plus(200);
		System.out.println(result);
		
	}
	
	// f(n) = n + f(n-1)
	public static int plus(int n) {
		System.out.println("n: " + n);
		if (n <= 100) {
			return n;
		} else {
			return n + plus(n-1);
		}
		
	}

	
}
