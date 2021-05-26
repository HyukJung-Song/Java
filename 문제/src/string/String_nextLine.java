package string;
import java.util.Random;
import java.util.Scanner;

public class String_nextLine {
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("화면에 주사위를 굴릴까요? [Enter]");
		sc.nextLine();		// 입력된 값을 문자로 만들어줌(그냥 Enter키도 먹음!!)
		
		Random rd = new Random();
		int userNum = rd.nextInt(6) + 1;
		System.out.println("내가 뽑은 번호 : " + userNum + "\n");
		
		System.out.print("컴퓨터가 주사위를 굴립니다. 실행할까요? [Enter]");
		sc.nextLine();
		int comNum = rd.nextInt(6) + 1;
		System.out.println("컴퓨터가 뽑은 번호: " + comNum + "\n");
		
		if (userNum > comNum) {
			System.out.println("You Win!!");
		} else if (userNum < comNum) {
			System.out.println("You Loseㅠㅠ");
		} else {
			System.out.println("Draw ~");
		}
		
		
	}
}
