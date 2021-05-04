package c0504_1;

import java.util.Scanner;

public class Date_2_Exec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<9999; i++) {
			System.out.println("원하시는 기능을 선택하세요.");
			System.out.println("1. 기념일 입력");
			System.out.println("2. D-day 입력");
			System.out.println("exit: 종료");
			
			String userInputString = sc.nextLine();
			if (userInputString.equals("1")) {
				// 기념일 입력
				System.out.println("기념일 입력(ex. 20210504) : ");
			} else if (userInputString.equals("2")) {
				// D-day 출력
			} else if (userInputString.equals("exit")) {
				break;
			}
		}
		
		
		
	}
}
