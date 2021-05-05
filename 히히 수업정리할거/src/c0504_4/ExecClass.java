package c0504_4;

import java.util.ArrayList;
import java.util.Scanner;

public class ExecClass {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> Business = new ArrayList<Employee>();
		ArrayList<Employee> Development = new ArrayList<Employee>();
		ArrayList<Employee> HumanResources = new ArrayList<Employee>();
		ArrayList<Employee> Others = new ArrayList<Employee>();
		
		
		Team[] teams = {new Team("인사팀"), new Team("개발팀"), new Team("영업팀")};
		for (int i=0; i<999; i++) {
			System.out.println("==== 인사관리 프로그램 ====");
			System.out.println("원하시는 기능을 선택해주세요.");
			System.out.println("1 : 인사 정보 입력");
			System.out.println("2 : 인사 정보 출력");
			System.out.println("3 : 인사 정보 수정");
			System.out.println("quit : 종료");

			String userInputString = sc.nextLine();
			if (userInputString.equals("1")) {
				Employee e = new Employee();
				e.inputData();
				// 번호로 받는게 더 낳을듯
				if (e.department.contains("인사")) {
					teams[0].staffs.add(e);
				} else if (e.department.contains("개발")) {
					teams[1].staffs.add(e);
				} else if (e.department.contains("영업")) {
					teams[2].staffs.add(e);
				} else {
					teams[3].staffs.add(e);
				}
			}
			else if (userInputString.equals("2")) {
				for (int j=0; j<teams.length; j++) {
					System.out.println("" + teams[j].name + " 정보 출력");
					 for (int k=0; k<teams[k].staffs.size(); k++) {
						 System.out.println(teams[j].staffs.get(k));
					 }
				}
			}
			else if (userInputString.equals("3")) {
				System.out.println();
				
			}
			else if (userInputString.equals("quit")) {
				break;
			}
			
			

		
		}
	
	}
}
