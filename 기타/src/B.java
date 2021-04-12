
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class B {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.setIn(new FileInputStream("src\\test.txt"));  // \\test.txt는 안됨!!

		Scanner scan = new Scanner(System.in);

		int n = Integer.parseInt(scan.nextLine());
		
		System.out.println(n);



		
	}
}
