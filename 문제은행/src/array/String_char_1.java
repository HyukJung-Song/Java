package array;
import java.util.Arrays;
import java.util.Scanner;

public class String_char_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s1 = "1 2 3 4";
		String[] c1 = s1.split(" ");
		System.out.println(c1.length);
		System.out.println(Arrays.toString(c1));
		System.out.println();
	
		char[] c2 = {'a', ' ', 'c'};
		System.out.println(c2.length);
		System.out.println(Arrays.toString(c2));
		
		
	}
}
