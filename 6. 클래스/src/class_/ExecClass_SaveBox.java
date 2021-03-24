package class_;

import java.util.Scanner;

public class ExecClass_SaveBox {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// 금고 생성 (★★★ for문 안에 넣으면 coins가 계속 초기화됨!!!)
		SaveBox myBox = new SaveBox();

		for (int i = 0; i < 9999999; i++) {
			System.out.println("====================");
			System.out.println("원하시는 메뉴를 선택해주세요.");
			System.out.println("1: 입금");
			System.out.println("2: 입금 + 메시지");
			System.out.println("crash: 종료");
			System.out.println("--------------------");
			System.out.print("입력: ");

			// 1, 2, crash중 입력받기
			String userInputString = s.next();

			// 1(입금)
			if (userInputString.equals("1")) {
				System.out.print("입금할 금액: ");
				int coin = s.nextInt();
				myBox.deposit(coin);
			// 2(입금 + 메시지)
			} else if (userInputString.equals("2")) {
				System.out.print("입금할 금액: ");
				int coin = s.nextInt();
				myBox.depositWithMsg(coin);
			// crash (종료)
			} else if (userInputString.equals("crash")) {
				myBox.end();
				break;
			// 예외처리
			} else {
				System.out.println("다시 입력하세요!!");
			}
		}
		s.close();
		
		
	}
}
