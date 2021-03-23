package conditional;

import java.util.Scanner;

public class Switch_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1~5중 입력:");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("★☆☆☆☆");
			break;
		case 2:
			System.out.println("★★☆☆☆");
			break;
		case 3:
			System.out.println("★★★☆☆");
			break;
		case 4:
			System.out.println("★★★★☆");
			break;
		default:
			System.out.println("★★★★★");
		}

	}
}
