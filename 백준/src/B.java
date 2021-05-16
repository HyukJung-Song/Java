
public class B {

	public static void main(String[] args) {
		
		System.out.println('1'+'2');	// 99 (49+50)
		System.out.println("1" + "2");	// 12
		System.out.println('1'+"2");	// 12
		System.out.println("1"+'2');	// 12
			
		System.out.println('1' > '2');	// false
		// System.out.println("1" > "2");  (x)
		
		System.out.println(Integer.parseInt("77"));		// 77
		System.out.println(Integer.parseInt("077"));	// 77
		System.out.println();
		
		// 숫자 char -> int로 전환
		System.out.println('0');			// 0 (char)
		System.out.println((int)'0');		// 48
		System.out.println((int)'0' - 48);	// 0 (int)
		
		String s = "abc";
		// System.out.println(s[0]);	(x)
		char[] arrChar = s.toCharArray();
		System.out.println();
		
		// null과 ""
		String s2 = null;
		s2 += "11";
		System.out.println(s2);		// null11
		s2 = "22";
		System.out.println(s2);		// 22
		s2 = "";
		s2 += "11";
		System.out.println(s2);		// 11
		s2 += '9';
		System.out.println(s2);		// 119
		System.out.println("test");
		
		// substring
	}
}
