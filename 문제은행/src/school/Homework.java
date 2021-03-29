package school;

public class Homework {

	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(plus(200));
		System.out.println(fibonacci(10));
	}
	
	// f(n) = n * f(n-1)
	public static int factorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
	
	// f(n) = n + f(n-1)
	public static int plus(int n) {
		if (n <= 100) {
			return n; 
		}
		return n + plus(n-1);
	}
	
	// f(n) = f(n-2) + f(n-1)
	public static int fibonacci(int nth) {
		if (nth == 0) {
			return 0;
		} else if (nth == 1) {
			return 1;
		} else {
			return fibonacci(nth-2) + fibonacci(nth-1);
		}
	}

}
