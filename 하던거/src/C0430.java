
public class C0430 {

	public static void main(String[] args) {
		
		// String 주소값에 대해서.
		String a = "Hello";
		String b = new String("Hello");
		
		System.out.println(a.hashCode());	// 69609650
		System.out.println(b.hashCode());	// 69609650
		// 같은 문자열일경우 같은 곳을 바라본다.
		
		if (a == b) {
			// 이거는 주소만 비교함. 문자열은 이렇게 쓰면 안됨.
			// a.equals("")로 써야 문자열 내용을 비교함.
		}
		
		a = "hi";
		System.out.println(a.hashCode());	// 3329
		
		a = "Hello";
		System.out.println(a.hashCode());	// 69609650
		
		a = a + "1";
		System.out.println(a.hashCode());	// -2137068097
		
		
		// StringBuffer 주소값에 대해
		StringBuffer c = new StringBuffer("Hello");
		System.out.println(c.hashCode());	// 1562557367
		c.append("1");
		System.out.println(c);	// Hello1
		System.out.println(c.hashCode());	// 1562557367
		// 이런식으로 StringBuffer는 String에 비해 메모리를 효율적으로 쓸 수 있다.
		
		// c = "hii"; (x)
		
		
	}
}
