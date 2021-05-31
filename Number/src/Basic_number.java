import java.util.Random;

public class Basic_number {

	public static void main(String[] args) {
		
		// 헷갈림
		System.out.println(Integer.parseInt("77"));		// 77
		System.out.println(Integer.parseInt("077"));	// 77
		System.out.println(0/2);				// 0
		System.out.println(0%2);				// 0
		System.out.println(1 + "1");			// 11
		
		
		// Integer.parseInt(str), Integer.toString(int)
		String s = "11";
		int s1 = Integer.parseInt(s);
		System.out.println(s1);
		String s2 = Integer.toString(s1);
		System.out.println(s2);
		System.out.println();
		
		
		// 삼항연산자
		for (int i=0; i<2; i++) {
			String name = (i==0)? "Student1":"Student2";
			System.out.println(i + " name" + name);
		}
		
		
		// Random
		Random rd = new Random();
		int rdNum = rd.nextInt(100);	// 0~99

		
		// 증감연산자
		int a = 1;
		int b = a++;
		int c = a;
		System.out.println("a : " + a);		// 2
		System.out.println("b : " + b);		// 1	
		System.out.println("c : " + c);		// 2
		
		

		
	}
}
