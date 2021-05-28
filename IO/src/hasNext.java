

import java.util.Scanner;

public class hasNext {

	public static void main(String[] args) {
		Scanner sc = new Scanner("Hello World! 123");
		
		System.out.println(sc.hasNext());	// true
		while(sc.hasNext()) {
			String value = sc.nextLine();
			System.out.println(value);		// Hello World! 123
		}
		System.out.println(sc.hasNext());	// false
		
		// hasNext()는 입력된 토큰이 있으면 true, 없으면 false 반환
		// next() 메소드는 띄어쓰기를 기준으로 읽음
		
	}
}
