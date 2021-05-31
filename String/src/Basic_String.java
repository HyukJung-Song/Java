import java.util.Arrays;

public class Basic_String {
	public static void main(String[] args) {

		
		// .charAt(idx)
		String str = "12 서울";		
		// System.out.println(str[0]); (x)
		System.out.println(str.charAt(4));					// 울

		
		// .toCharArray()
		String s = "abc";
		// System.out.println(s[0]);	(x)
		char[] arrChar = s.toCharArray();
		System.out.println();
		
		
		// .contains(str), .replaceAll(str, newStr) 
		if (s.contains("one")) {			// one 2 34
			s = s.replaceAll("one", "1");	// 1 2 34
		}
		System.out.println();		
		
		
		// .repeat(number)
		str = "abc".repeat(4);
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
