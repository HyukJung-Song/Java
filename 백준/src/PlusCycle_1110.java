

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusCycle_1110 {
	
	static int cnt = 0;
	static int n;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 0 <= n <= 99
		// 6 + (2+6) -> 68  // 8+(6+8) -> 84  // 4+(8+4) -> 42 // 2+(4+2) // 
		n = Integer.parseInt(br.readLine());	// 26
		
		int res = plusCycle(n);
		System.out.println(res);
	}
	
	public static int plusCycle(int a) {
		cnt++;
		int plus = (a % 10)*10 + ((a / 10) + (a % 10))%10;
		if (plus == n) {
	 		return cnt;
		}
		else {
	 		return plusCycle(plus);
		}
	}
}
