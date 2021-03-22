package conditional;

import java.util.Scanner;

public class Switch_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1~5Áß ÀÔ·Â: ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("¡Ú¡Ù¡Ù¡Ù¡Ù");
			break;
		case 2:
			System.out.println("¡Ú¡Ú¡Ù¡Ù¡Ù");
			break;
		case 3:
			System.out.println("¡Ú¡Ú¡Ú¡Ù¡Ù");
			break;
		case 4:
			System.out.println("¡Ú¡Ú¡Ú¡Ú¡Ù");
			break;
		default:
			System.out.println("¡Ú¡Ú¡Ú¡Ú¡Ú");
		}

	}
}
