package next;

import java.util.Scanner;

public class NextAndNextLine_1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// next()
		String value1 = scan.next(); 				
		System.out.println("next(): " + value1);	
		// nextLine()
		String value2 = scan.nextLine();			
		System.out.println("nextLine(): " + value2);
		
		// 결국 next()는 단어를 입력 받는데 기능은 nextInt()와 같다. 
		
		/*
		 * 	abc def
			next(): abc
			nextLine():  def
		 */
		
		/*
		 * 	1 2
			next(): 1
			nextLine():  2
		 */
		

		
		// nextLine()
		String value3 = scan.nextLine();			
		System.out.println("nextLine(): " + value3);
		// next()
		String value4 = scan.next(); 				
		System.out.println("next(): " + value4);	
		
		
	}
	
	

}
