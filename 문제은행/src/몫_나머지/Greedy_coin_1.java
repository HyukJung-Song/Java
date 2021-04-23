package 몫_나머지;

import java.util.*;

public class Greedy_coin_1 {
	
	// # 11047
	public static void main(String[] args) throws Exception {
		
		/*
		10 4200
		1
		5
		10
		50
		100
		500
		1000
		5000
		10000
		50000
		>
		6
		 */

		Scanner sc = new Scanner(System.in);

		int cntInput = sc.nextInt();
		int money = sc.nextInt();
		int count = 0;
		int[] coins = new int[cntInput];
		for (int i = 0; i < cntInput; i++) {
			coins[i] = sc.nextInt();
		}

		for (int i = cntInput - 1; i >= 0; i--) {
			if (money >= coins[i]) {
				count += money / coins[i];
				money = money % coins[i];
			}
		}
		System.out.println(count);
	}
}
