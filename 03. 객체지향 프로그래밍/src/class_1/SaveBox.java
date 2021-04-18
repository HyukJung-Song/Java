package class_1;

import java.util.Scanner;

public class SaveBox {
	Scanner s = new Scanner(System.in);
	
	int coins = 0;
	public void deposit(int coin) {
		System.out.println("딸그랑~~");
		System.out.println(coin + "원이 입급되었습니다!");
		coins = coins + coin;
	}
	
	public void depositWithMsg() {
		System.out.print("금액, 메시지: ");
		String message = s.nextLine();
		String[] mArr = message.split(",");
		
		int coin = Integer.parseInt(mArr[0]);
		coins = coins + coin;
		message = mArr[1].trim();	// trim()은 공백제거
		
		System.out.println(coin + "원이 입급되었습니다! / " + 
				"메시지: " + message);

	}
	
	public void end() {
		System.out.println("총액: " + coins);
		System.out.println("프로그램을 종료합니댜.");
		s.close();
	}
}
