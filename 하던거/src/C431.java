import java.util.Scanner;

public class C431 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		// StringBuffer의 역순기능. (String에는 없다.)
		StringBuffer sb = new StringBuffer(sc.nextLine());
		sb.reverse();			// apple
		System.out.println(sb);	// elppa
		System.out.println(sb.getClass().getName());  // java.lang.StringBuffer
		
		// StringBuffer > String
		String s = sb.toString();
		// or String s = new String(sb)
		System.out.println(s);
		
		
	}
}
