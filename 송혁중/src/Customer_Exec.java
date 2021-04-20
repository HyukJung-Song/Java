

import java.util.ArrayList;
import java.util.Scanner;

public class Customer_Exec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		int cnt = 1;	// 고객번호
		
		System.out.println("*** 고객관리 프로그램 ***");
		for (int i=0; i<9999; i++) {	
			System.out.println("====================");
			System.out.println("원하는 메뉴를 선택하세요");
			System.out.println("1. 고객정보 입력");
			System.out.println("2. 전체목록 출력");
			System.out.println("3. 종료");
			System.out.println("====================");
			
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				System.out.println("고객정보를 입력합니다.");
				System.out.print("고객명: ");
				String name = sc.next();
				System.out.print("연락처: ");
				sc.nextLine();
				String phone = sc.nextLine();
				System.out.print("고객등급(1~5): ");
				int grade = sc.nextInt();
				customerList.add(new Customer(cnt, name, phone, grade));
				cnt++;
				System.out.println("입력성공!\n");
				break;
			case 2:
				System.out.println("\n전체목록을 출력합니다!");
				for (int j=0; j<customerList.size(); j++) {
					System.out.print(customerList.get(j).num + ". 고객명: " + customerList.get(j).name + " ");
					System.out.print("연락처: " + customerList.get(j).phoneNumber + " ");
					switch(customerList.get(j).grade) {
					case 1:
						System.out.println("고객등급: " + "★☆☆☆☆");
						break;
					case 2:
						System.out.println("고객등급: " + "★★☆☆☆");
						break;
					case 3:
						System.out.println("고객등급: " + "★★★☆☆");
						break;
					case 4: 
						System.out.println("고객등급: " + "★★★★☆");
						break;
					default: 
						System.out.println("고객등급: " + "★★★★★");
						break;
					}
				}
				// 평균별점 계산
				int gradeSum = 0;
				for (int j=0; j<customerList.size(); j++) {
					gradeSum += customerList.get(j).grade;
				}
				double gradeAvg = (double)gradeSum/customerList.size();
				System.out.println("고객 평균등급 : " + gradeAvg);
				System.out.println();
				break;
			default:
				System.out.println("종료합니다.");
				return;
			}
			
			
		}
	}
}
