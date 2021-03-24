package next;

import java.util.Scanner;

public class NextLine_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			String value = scan.nextLine();
			System.out.println(value);
		}
		// nextLine()메소드는 한 라인을 읽는다. (엔터기준, 띄어쓰기는 포함됨) 
		
	}
}
