package 코딩실습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mid5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int stu = Integer.parseInt(br.readLine());	// 95 (1~999)
		
		// 350 / 45 = 7.7777 -> 8대
		// 350 / 25 = 14 -> 15대

		int bus45Max = (stu/45) + 1;		// 3
		int bus25Max = (stu/25) + 1;		// 4
		int bus45=0, bus25=0;				// 1 2
		int minMoney = bus45Max * 45;		// 95
		int sum; 								// stu = 95
		for (int i=0; i<=bus45Max; i++) {		// 0,1,2,3
			for (int j=0; j<=bus25Max; j++) {	// 0,1,2,3,4
				sum = i*45 + j*25;	// 총 금액(총 수용인원)
				if (sum >= stu && sum <= minMoney) {
					minMoney = sum;
					bus45 = i;
					bus25 = j;
				}
			}
		}
		System.out.println(bus45 + " " + bus25);
		
		
		
//		int stu = Integer.parseInt(br.readLine());
//		final int bus45 = 45;
//		final int bus25 = 25;
//		int res45 = 0;
//		int res25 = 0;
//								// 24, 25, 26 / 44, 45, 46 / 49, 50, 51 / 69, 70, 71 / 89, 90, 91
//		if (stu % bus25 == 0) {
//			System.out.println(res45+" "+stu/bus25);
//			return;
//		}
//		
//		while(true) {			
//			if(stu >= bus45) {
//				stu -= bus45;
//				res45++;
//				if(stu % bus25 == 0) {
//					System.out.println(res45+" "+stu/bus25);
//					break;
//				}
//			} else{
//				int temp = (stu <= bus25) ? res25++ : res45++;
//				System.out.println(res45+" "+res25);
//				break;
//			}
//		}
		
		
	}
}
