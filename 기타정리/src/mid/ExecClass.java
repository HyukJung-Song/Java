package mid;

import java.util.ArrayList;
import java.util.Scanner;

public class ExecClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Voter> voters = new ArrayList<Voter>();
		ArrayList<Party> parties = new ArrayList<Party>();
		int[] ageGroups = null;

		// STEP 1. 유권자 기본정보 관리
		for (int a = 0; a < 9999; a++) {

			System.out.println("\n\n유권자 기본정보 조사");
			System.out.println("---------------");
			System.out.println("1. 유권자 정보입력");
			System.out.println("2. 전체정보 출력");
			System.out.println("3. 선호정당 입력");
			System.out.println("4. 선호정당 통계 출력");
			System.out.println("종료를 원하시면 '종료'라고 입력해주세요.");
			System.out.print("메뉴를 입력해주세요: ");
			String menu = sc.nextLine();
			System.out.println("---------------\n");

			if (menu.equals("1")) {
				System.out.print("유권자 이름: ");
				String name = sc.nextLine();
				System.out.print("유권자 주소: ");
				String address = sc.nextLine();
				System.out.print("유권자 나이: ");
				int age = Integer.parseInt(sc.nextLine());

				voters.add(new Voter(name, address, age));
				System.out.println("정상 입력되었습니다.");

			} else if (menu.equals("2")) {
				System.out.println("전체정보를 출력합니다.");
				System.out.println("---------------");
				for (int i = 0; i < voters.size(); i++) {
					System.out.println("유권자 이름: " + voters.get(i).name + ", 주소: " + voters.get(i).address + ", 나이: "
							+ voters.get(i).age);
				}
				System.out.println("---------------");

				// STEP 2. 입력된 정보의 기본 통계
				int numVoters = voters.size();
				System.out.println("# 전체 입력된 유권자의 수: " + numVoters);
				int sumAge = 0;
				double avgAge;
				for (int i = 0; i < voters.size(); i++) {
					sumAge = sumAge + voters.get(i).age;
				}
				avgAge = (double) sumAge / voters.size();
				System.out.printf("# 유권자의 평균나이: %.1f\n", avgAge);
				ageGroups = new int[9];
				for (int i = 0; i < voters.size(); i++) {
					switch (voters.get(i).ageGroup) {
					case 20:
						ageGroups[0] = ageGroups[0] + 1;
						break;
					case 30:
						ageGroups[1] = ageGroups[1] + 1;
						break;
					case 40:
						ageGroups[2] = ageGroups[2] + 1;
						break;
					case 50:
						ageGroups[3] = ageGroups[3] + 1;
						break;
					case 60:
						ageGroups[4] = ageGroups[4] + 1;
						break;
					case 70:
						ageGroups[5] = ageGroups[5] + 1;
						break;
					case 80:
						ageGroups[6] = ageGroups[6] + 1;
						break;
					case 90:
						ageGroups[7] = ageGroups[7] + 1;
						break;
					default:
						ageGroups[8] = ageGroups[8] + 1;
					}
				}
				System.out.print("# 연령대별 유권자의 수: ");
				int cnt = 0;
				for (int i = 0; i < ageGroups.length; i++) {
					if (ageGroups[i] != 0) {
						cnt++;
						if (cnt == voters.size()) {
							System.out.print((i + 2) + "0대 " + ageGroups[i] + "명");
						} else {
							System.out.print((i + 2) + "0대 " + ageGroups[i] + "명, ");
						}
					}
				}
				System.out.println();

				// Step 3. 각 유권자별 선호 정당 관리.
			} else if (menu.equals("3")) {
				System.out.println("선호 정당을 입력합니다.");
				System.out.print("등록되어있는 유권자의 이름을 입력하세요: ");
				String inputName = sc.nextLine();
				String userName = "";
				String userAddress = "";
				int userAge = 0;
				int userAgeGroup = 0;
				for (int i = 0; i < voters.size(); i++) {
					if (voters.get(i).name.equals(inputName)) {
						userName = voters.get(i).name;
						userAddress = voters.get(i).address;
						userAge = voters.get(i).age;
						userAgeGroup = voters.get(i).ageGroup;
						break;
					}
				}
				if (userName.equals("")) {
					System.out.println("입력한 이름의 유권자는 등록정보에 없습니다.");
				} else {
					int idx = -1;
					for (int i = 0; i < parties.size(); i++) {
						if (parties.get(i).name.equals(userName)) {
							idx = i;
							break;
						}
					}
					if (idx != -1) {
						System.out.println("이미 정당을 입력하셨습니다.");
						System.out.println("1. 정당 수정");
						System.out.println("2. 메뉴로 돌아가기");
						String menuParty = sc.nextLine();
						if (menuParty.equals("1")) {
							System.out.print("수정할 선호정당을 입력해주세요(A,B,C): ");
							String inputParty = sc.nextLine().toUpperCase();
							parties.get(idx).preferParty = inputParty;
							System.out.println(inputParty + "로 선호정당이 수정되었습니다!");
						}
					} else {
						System.out.print("선호정당을 입력해주세요(A,B,C): ");
						String inputParty = sc.nextLine().toUpperCase();
						if (inputParty.equals("A")) {
							parties.add(new Party(userName, userAddress, userAge, userAgeGroup, "A"));
							System.out.println(inputParty + "로 선호정당이 입력되었습니다!");
						} else if (inputParty.equals("B")) {
							parties.add(new Party(userName, userAddress, userAge, userAgeGroup, "B"));
							System.out.println(inputParty + "로 선호정당이 입력되었습니다!");
						} else if (inputParty.equals("C")) {
							parties.add(new Party(userName, userAddress, userAge, userAgeGroup, "C"));
							System.out.println(inputParty + "로 선호정당이 입력되었습니다!");
						} else {
							System.out.println("정당을 잘못 입력하셨습니다...");
						}
					}
				}
//				for (int i=0; i<parties.size(); i++) {
//					System.out.println("유권자 이름: " + parties.get(i).name + 
//							", 선호정당: " + parties.get(i).preferParty);
//				}

				// Step 4. 선호 정당에 대한 통계
			} else if (menu.equals("4")) {
				if (parties.size() == 0) {
					System.out.println("선호정당이 등록되어 있는 사람이 없습니다..");
				} else {
					// 1) 전체 유권자 대비 선호 정당을 입력한 사람의 수 및 비율
					System.out.println("선호 정당에 대한 통계를 출력합니다.");
					System.out.println("---------------");
					int sumOfinputPreferParty = parties.size();
					System.out.println("# 선호 정당을 입력한 인원수: " + sumOfinputPreferParty + "명");
					int sumVoters = voters.size();
					int ratioPreferPerVoters = (int) Math.round((sumOfinputPreferParty / (double) sumVoters) * 100);
					System.out.println("# 전체 유권자 대비 선호 정당을 입력한 사람의 비율: " + ratioPreferPerVoters + "%");

					// 2) 정당 별 선호자 수 및 비율
					System.out.println("\n<정당 별 선호자 수 및 비율>");
					int numA = 0;
					int numB = 0;
					int numC = 0;
					for (int i = 0; i < parties.size(); i++) {
						if (parties.get(i).preferParty.equals("A")) {
							numA = numA + 1;
						} else if (parties.get(i).preferParty.equals("B")) {
							numB = numB + 1;
						} else if (parties.get(i).preferParty.equals("C")) {
							numC = numC + 1;
						}
					}
					System.out.println("A정당 선호자 수: " + numA + ", 비율: "
							+ (int) Math.round((numA / (double) sumVoters) * 100) + "%");
					System.out.println("B정당 선호자 수: " + numB + ", 비율: "
							+ (int) Math.round((numB / (double) sumVoters) * 100) + "%");
					System.out.println("C정당 선호자 수: " + numC + ", 비율: "
							+ (int) Math.round((numC / (double) sumVoters) * 100) + "%");

					// 3) 연령대 별 선호 정당의 수 및 비율
					System.out.println("\n<연령대별 선호 정당의 수 및 비율>");
					int[][] ageGroup = new int[9][];
					for (int i = 0; i < ageGroup.length; i++) {
						int[] ageGroupABC = { 0, 0, 0 };
						int parseIntAgeGroup = Integer.parseInt((i + 2) + "0");

						for (int j = 0; j < parties.size(); j++) {
							if (parties.get(j).ageGroup == parseIntAgeGroup) {
								if (parties.get(j).preferParty.equals("A")) {
									ageGroupABC[0]++;
								} else if (parties.get(j).preferParty.equals("B")) {
									ageGroupABC[1]++;
								} else if (parties.get(j).preferParty.equals("C")) {
									ageGroupABC[2]++;
								}
							}
							ageGroup[i] = ageGroupABC;
						}
					}

					for (int i = 0; i < ageGroup.length; i++) {
						int sum = ageGroup[i][0] + ageGroup[i][1] + ageGroup[i][2];
						System.out.println((i + 2) + "0대 ");
						System.out.print("A당 선호자수: " + ageGroup[i][0]);
						System.out.println(", 비율: " + (int) Math.round((ageGroup[i][0] / (double) sum) * 100) + "%");
						System.out.print("B당 선호자수: " + ageGroup[i][1]);
						System.out.println(", 비율: " + (int) Math.round((ageGroup[i][1] / (double) sum) * 100) + "%");
						System.out.print("C당 선호자수: " + ageGroup[i][2]);
						System.out.println(", 비율: " + (int) Math.round((ageGroup[i][2] / (double) sum) * 100) + "%");
					}
				}
				
				// 4) 권역대 별 선호 정당의 수 및 비율
				/*
				 	서울시
					A당 선호자수 :   비율: 
					B당
					C당
					
					
					경기도
					
					충북
					
					그외
				 */
				System.out.println("\n<권역대별 선호 정당의 수 및 비율>");
				int[][] addressGroups = {{0,0,0}, {0,0,0}, {0,0,0}, {0,0,0}};  
				
				for (int i=0; i<parties.size(); i++) {
					String address = parties.get(i).address;
					String preferParty = parties.get(i).preferParty;
					if (address.contains("서울")) {
						if (preferParty == "A") {
							addressGroups[0][0]++;
						} else if (preferParty  == "B") {
							addressGroups[0][1]++;
						} else if (preferParty  == "C"){
							addressGroups[0][2]++;
						}
					} else if (address.contains("경기")) {
						if (preferParty == "A") {
							addressGroups[1][0]++;
						} else if (preferParty  == "B") {
							addressGroups[1][1]++;
						} else if (preferParty  == "C"){
							addressGroups[1][2]++;
						}
					} else if (address.contains("충북") || address.contains("충청북도")) {
						if (preferParty  == "A") {
							addressGroups[2][0]++;
						} else if (preferParty  == "B") {
							addressGroups[2][1]++;
						} else if (preferParty  == "C"){
							addressGroups[2][2]++;
						}
					} else {
						if (preferParty  == "A") {
							addressGroups[3][0]++;
						} else if (preferParty  == "B") {
							addressGroups[3][1]++;
						} else if (preferParty  == "C"){
							addressGroups[3][2]++;
						}
					}
				}
				
				for (int i=0; i<addressGroups.length; i++) {
					int sum = addressGroups[i][0] + addressGroups[i][1] + addressGroups[i][2];
					if (i==0) {
						System.out.println("서울시");
						System.out.print("A당 선호자수: " + addressGroups[i][0]);
						System.out.println(", 비율: " + (int) Math.round((addressGroups[i][0] / (double) sum) * 100) + "%");
						System.out.print("B당 선호자수: " + addressGroups[i][1]);
						System.out.println(", 비율: " + (int) Math.round((addressGroups[i][1] / (double) sum) * 100) + "%");
						System.out.print("C당 선호자수: " + addressGroups[i][2]);
						System.out.println(", 비율: " + (int) Math.round((addressGroups[i][2] / (double) sum) * 100) + "%");
					} else if (i==1) {
						System.out.println("경기도");
						System.out.print("A당 선호자수: " + addressGroups[i][0]);
						System.out.println(", 비율: " + (int) Math.round((addressGroups[i][0] / (double) sum) * 100) + "%");
						System.out.print("B당 선호자수: " + addressGroups[i][1]);
						System.out.println(", 비율: " + (int) Math.round((addressGroups[i][1] / (double) sum) * 100) + "%");
						System.out.print("C당 선호자수: " + addressGroups[i][2]);
						System.out.println(", 비율: " + (int) Math.round((addressGroups[i][2] / (double) sum) * 100) + "%");
	
					} else if (i==2) {
						System.out.println("충청북도");
						System.out.print("A당 선호자수: " + addressGroups[i][0]);
						System.out.println(", 비율: " + (int) Math.round((addressGroups[i][0] / (double) sum) * 100) + "%");
						System.out.print("B당 선호자수: " + addressGroups[i][1]);
						System.out.println(", 비율: " + (int) Math.round((addressGroups[i][1] / (double) sum) * 100) + "%");
						System.out.print("C당 선호자수: " + addressGroups[i][2]);
						System.out.println(", 비율: " + (int) Math.round((addressGroups[i][2] / (double) sum) * 100) + "%");
	
					} else {
						System.out.println("그외");
						System.out.print("A당 선호자수: " + addressGroups[i][0]);
						System.out.println(", 비율: " + (int) Math.round((addressGroups[i][0] / (double) sum) * 100) + "%");
						System.out.print("B당 선호자수: " + addressGroups[i][1]);
						System.out.println(", 비율: " + (int) Math.round((addressGroups[i][1] / (double) sum) * 100) + "%");
						System.out.print("C당 선호자수: " + addressGroups[i][2]);
						System.out.println(", 비율: " + (int) Math.round((addressGroups[i][2] / (double) sum) * 100) + "%");
					}
				}

			} else if (menu.equals("종료")) {
				System.out.println("종료합니다.");
				break;

			} else {
				System.out.println("제대로 입력하세요!!");
			}

		} // for
	} // main
} // class
