package conditional;

import java.util.Scanner;

public class Switch_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1~5�� �Է�: ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("�ڡ١١١�");
			break;
		case 2:
			System.out.println("�ڡڡ١١�");
			break;
		case 3:
			System.out.println("�ڡڡڡ١�");
			break;
		case 4:
			System.out.println("�ڡڡڡڡ�");
			break;
		default:
			System.out.println("�ڡڡڡڡ�");
		}

	}
}
