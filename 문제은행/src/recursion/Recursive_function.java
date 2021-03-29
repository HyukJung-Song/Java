package recursion;

public class Recursive_function {

	
	public static void main(String[] args) {
		
		System.out.println(plus(100));
		System.out.println(factorial(5));
		System.out.println(fibonacci(10));
	}    
	
	// f(n) = f(n-2) + f(n-1)
	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {			
			return fibonacci(n-2) + fibonacci(n-1);
		}
	}
	
	// f(n) = n * f(n-1)
	public static int factorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}
	
	// f(n) = n + f(n-1)
	public static int plus(int n) {
		if (n <= 1) {
			return n;
		} else {
			return n + plus(n-1);
		}
	}
	// return 1 + f(2)   // f(1) 일 경우
	// 			  return 2 + f(3)
	//                       return 3 + f(4)
	//                                  return 4. (exit 조건일경우)
	

	
}
