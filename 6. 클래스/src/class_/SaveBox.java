package class_;

import java.util.Scanner;

public class SaveBox {
	Scanner s = new Scanner(System.in);
	
	int coins = 0;
	public void deposit(int coin) {
		System.out.println("딸그랑~~");
		System.out.println(coin + "원이 입급되었습니다!");
		coins = coins + coin;
	}
	
	public void depositWithMsg(int coin) {
		System.out.print("메시지: ");
		String message = s.nextLine();
		
		System.out.println(message);
		System.out.println(coin + "원이 입급되었습니다!");
		coins = coins + coin;
	}
	
	public void end() {
		System.out.println("총액: " + coins);
		System.out.println("프로그램을 종료합니댜.");
		s.close();
	}
}
