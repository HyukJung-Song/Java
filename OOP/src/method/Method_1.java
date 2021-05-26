package method;

import java.util.Random;

public class Method_1 {

	public void testMethod() {
		Random r = new Random();
		int num1 = r.nextInt(100);
		int num2 = r.nextInt(100);
		
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
	}
	
	public static void testMethod2(int n1, int n2) {
//		Random r2 = new Random();
//		int number1 = r2.nextInt(100);
//		int number2 = r2.nextInt(100);
		
		System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
	}
	
	public static void main(String[] args) {
		Method_1 m = new Method_1();
		m.testMethod();
		// testMethod2();
		
		Random r = new Random();
		int n1 = r.nextInt(100);
		int n2 = r.nextInt(100);
		testMethod2(n1, n2);
	}
}
