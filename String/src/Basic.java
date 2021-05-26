
public class Basic {

	public static void main(String[] args) {

		
		// .toCharArray()
		String s = "abc";
		// System.out.println(s[0]);	(x)
		char[] arrChar = s.toCharArray();
		System.out.println();
		
		
		// .repeat(number)
		String str = "abc".repeat(4);
		System.out.println(str);	// abcabcabcabc
		
		
		//.substring(start) / (start, end)
		s = "abc def";
		System.out.println(s.substring(2));		// c def
		System.out.println(s.substring(4, 6));	// de
		
		
		// null과 ""
		String s2 = null;
		s2 += "11";
		System.out.println(s2);		// null11
		s2 = "22";
		System.out.println(s2);		// 22
		s2 = "";
		s2 += "11";
		System.out.println(s2);		// 11

	}
}
