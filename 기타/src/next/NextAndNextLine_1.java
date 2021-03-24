package next;

import java.util.Scanner;

public class NextAndNextLine_1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// next()
		String value1 = scan.next(); 				// 가나다라
		System.out.println("next(): " + value1);	// 가나다라
		// nextLine()
		String value2 = scan.nextLine();			// 마바사
		System.out.println("nextLine(): " + value2);
	}
}
