
public class Char {

	public static void main(String[] args) {
		
		// 헷갈림
		System.out.println('1' > '2');	// false
		// System.out.println("1" > "2");  (x)
		System.out.println('1'+'2');	// 99 (49+50)
		
		
		// char 계산
		long a = 10;
		a = a + '9' - '0';
		System.out.println(a);			// 19
		System.out.println('3');		// 3
		System.out.println('0');		// 0
		System.out.println('3'-'0');	// 3
		
		
		// 숫자 char -> int로 전환
		System.out.println('0');			// 0 (char)
		System.out.println((int)'0');		// 48
		System.out.println((int)'0' - 48);	// 0 (int)
		
		
		// String에 char도 더해짐.
		String str = "";
		str += 'a';
		str += "bc";
		System.out.println(str);	// abc
		System.out.println("1" + "2");	// 12
		System.out.println('1'+"2");	// 12
		System.out.println("1"+'2');	// 12
	}
}
