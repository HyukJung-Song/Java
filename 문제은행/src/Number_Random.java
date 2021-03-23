

import java.util.Random;

public class Number_Random {
	
	public static void main(String[] args) {
		
		
	Random rd = new Random();
	int rdNum = rd.nextInt();
	rdNum %= 100; 	// 0~99 = rd.nextInt(100)
	
	System.out.println("랜덤숫자 : " + rdNum);
	
	if (rdNum % 2 == 0 && rdNum > 0) {
		System.out.println("짝수");
	} else if (rdNum > 0) {
		System.out.println("홀수");
	} else if (rdNum < 0) {
		System.out.println("음수");
	} else {
		System.out.println("0");
	}
	
	
	
	
	
	
	}
}
