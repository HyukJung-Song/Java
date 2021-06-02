import java.util.Random;

public class Basic_number {

	public static void main(String[] args) {
		
		// 헷갈림
		System.out.println(Integer.parseInt("77"));		// 77
		System.out.println(Integer.parseInt("077"));	// 77
		System.out.println(0/2);				// 0 (몫)
		System.out.println(0%2);				// 0 (나머지)
		System.out.println(1 + "1");			// 11
		
		
		// Integer.parseInt(str), Integer.toString(int)
		String s = "11";
		int s1 = Integer.parseInt(s);
		System.out.println(s1);
		String s2 = Integer.toString(s1);
		System.out.println(s2);
		System.out.println();
		
		
		// Random
		Random rd = new Random();
		int rdNum = rd.nextInt(100);	// 0~99
	
	}
}
