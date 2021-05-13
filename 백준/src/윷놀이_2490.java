import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 윷놀이_2490 {
	
/*
0 1 0 1
1 1 1 0
0 0 1 1

>
B
A
B
*/

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for (int i=0; i<3; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int cnt0 = 0;
			for (int j=0; j<4; j++) {
				int n = Integer.parseInt(st.nextToken());
				if (n==0)	cnt0++;
			}
			if (cnt0 == 1) {
				System.out.println("A");
			} else if (cnt0 == 2) {
				System.out.println("B");
			} else if (cnt0 == 3) {
				System.out.println("C");
			} else if (cnt0 == 4) {
				System.out.println("D");
			} else {
				System.out.println("E");
			}
		}
	}
}
