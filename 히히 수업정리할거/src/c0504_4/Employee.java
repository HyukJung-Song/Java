package c0504_4;

import java.util.Scanner;

public class Employee {
	String department;
	String name;
	String position;
	String job;
	
	public void inputData() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("부서를 입력해주세요: ");
		this.department = scanner.nextLine();
		System.out.print("이름을 입력해주세요: ");
		this.name = scanner.nextLine();
		System.out.print("직위를 입력해주세요: ");
		this.position = scanner.nextLine();
		System.out.print("담당업무를 입력해주세요: ");
		this.job = scanner.nextLine();
	}

	@Override
	public String toString() {
		return "[이름: " + name + ", 부서: " + department + ", 직위: " + position + ", 담당업무: " + job + "]";
	}
	

}
