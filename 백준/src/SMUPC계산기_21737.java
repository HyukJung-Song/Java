import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SMUPC계산기_21737 {
	
			
/*
 
S: -,  M: *,  U: /,  P: +,  C: =  

5
3S2M3U1P2C
>
5


4
0328CS00325CC
>
328 3 3
 */
	
	static int tmpRes, tmp, calcNo; 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String target = br.readLine();
		
		tmpRes = tmp = calcNo = 0;
		boolean chk = false;
		// String res = "";
		// 골때리는게 res로 하면 백준 통과가 안됨. String보다 StringBuilder가 훨씬 범위가 넒은듯!
		for (int i=0; i<target.length(); i++) {
			if (target.charAt(i) == 'S') {
				calc();
				calcNo = 1;
			} else if (target.charAt(i) == 'M') {
				calc();
				calcNo = 2;
			} else if (target.charAt(i) == 'U') {
				calc();
				calcNo = 3;	
			} else if (target.charAt(i) == 'P') {
				calc();
				calcNo = 0;
			} else if (target.charAt(i) == 'C') {
				calc();
				calcNo = 0;
				if (!chk) {
					sb.append(tmpRes);
//					res += tmpRes;
				} else {
					sb.append(" " + tmpRes);
//					res += " " + tmpRes;
				}
				chk = true;
			} else {
				tmp = 10*tmp + target.charAt(i) - '0';
			}
		}
		if (!chk) {
			System.out.println("NO OUTPUT");
		} else {
			System.out.println(sb);
		}
	}
	
	static void calc() {
		if (calcNo == 0) {
			tmpRes += tmp;
		} else if (calcNo == 1) {
			tmpRes -= tmp;
		} else if (calcNo == 2) {
			tmpRes *= tmp;
		} else if (calcNo == 3) {
			tmpRes /= tmp;
		}
		tmp = 0;
	}
}
