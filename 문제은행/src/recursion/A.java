package recursion;

public class A {
	
	public static void main(String[] args) {
		
		function1(3);
		
	}
	
	static void function1(int a) {
		if (a==1) {
			System.out.println("a: 1(끝)");
		}
		else {
			System.out.println("a: " + a);
			function1(a-1);
		}
	}
}
