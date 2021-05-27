package next;

import java.util.Scanner;

public class Next_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			String value = scan.next();
			System.out.println(value);
		}
		// hasNext()는 입력된 토큰이 있으면 true, 없으면 false 반환
		//             만일 토큰에 개행문자만 남은경우 false지만 개행문자는 그대로 남아있음.
		// next() 메소드는 띄어쓰기를 기준으로 읽음
		
	}
}
