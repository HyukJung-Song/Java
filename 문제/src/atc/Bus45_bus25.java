package atc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bus45_bus25 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int stu = Integer.parseInt(br.readLine());	// 25 (1~999)
		
		// 350 / 45 = 7.7777 -> 8대
		// 350 / 25 = 14 -> 15대

		int bus45Max = (stu/45) + 1;		// 1
		int bus25Max = (stu/25) + 1;		// 2
		int bus45=0, bus25=0;
		int minMoney = bus45Max * 45;		// 45
		int sum;
		for (int i=0; i<=bus45Max; i++) {		// 0,1
			for (int j=0; j<=bus25Max; j++) {	// 0,1,2
				sum = i*45 + j*25;
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
