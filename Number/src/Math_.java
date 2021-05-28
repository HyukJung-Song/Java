
public class Math_ {

	public static void main(String[] args) {
		
		// 최대, 최소값
		System.out.println(Math.max(4, 99.8));	// 99.8
		
		
		// 반올림
		double a = 2.628;
		a = Math.round(a);	// 3.0
		
		// 소수점 2번째까지(3번째자리에서 반올림)
		a = (double)Math.round(a * 100) / 100;	// 2.63
		System.out.printf("%.2f", a);	// 2.63
		if(a > 0) {
			int b = 0;
			System.out.println("11");
		} else{
			System.out.println("222");
		}

		
	}
}
