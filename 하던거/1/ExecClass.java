import java.util.ArrayList;
import java.util.Scanner;

public class ExecClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<People> people = new ArrayList<People>();
		for (int i = 0; i < 99999; i++) {
			System.out.println("원하시는 기능을 선택해주세요.");
			System.out.println("1 : 유권자 정보 입력");
			System.out.println("2 : 입력받은 전체 유권자 출력");
			System.out.println("quit : 종료");
			
			String userInputString = scanner.nextLine();
			if (userInputString.equals("1")) {
				People p1 = new People();
				p1.inputData();
				people.add(p1);
			} else if (userInputString.equals("2")) {
				for (int j = 0; j < people.size(); j++) {
					System.out.println(people.get(j));
				}
			} else if (userInputString.equals("quit")) {
				break;
			}
		}
	}
}
