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
			System.out.println("3 : 기본 통계 출력");
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
			} else if (userInputString.equals("3")) {
				System.out.println("전체 유권자 수 : " + people.size());
				int totalAge = 0;
				for (int j = 0; j < people.size(); j++) {
					totalAge = totalAge + people.get(j).age;
				}
				System.out.println("유권자 평균 나이 : " + (totalAge / (double)people.size()));
				int total20 = 0;
				int total30 = 0;
				int total40 = 0;
				int total50 = 0;
				for (int j = 0; j < people.size(); j++) {
					if (people.get(j).age >= 20 && people.get(j).age < 30) {
						total20++;
					} else if (people.get(j).age >= 30 && people.get(j).age < 40) {
						total30++;
					} else if (people.get(j).age >= 40 && people.get(j).age < 50) {
						total40++;
					} else if (people.get(j).age >= 50 && people.get(j).age < 60) {
						total50++;
					}
				}
				System.out.println("20대 유권자 수 : " + total20);
				System.out.println("30대 유권자 수 : " + total30);
				System.out.println("40대 유권자 수 : " + total40);
				System.out.println("50대 유권자 수 : " + total50);
			} else if (userInputString.equals("quit")) {
				break;
			}
		}
	}
}
