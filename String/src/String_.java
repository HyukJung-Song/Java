
public class String_ {

	public static void main(String[] args) {
		
		// 문자도 더해짐.
		String str = "";
		str += 'a';
		str += "bc";
		System.out.println(str);	// abc
		
		
		// .repeat
		str = "abc".repeat(4);
		System.out.println(str);	// abcabcabcabc
		

	}
}
