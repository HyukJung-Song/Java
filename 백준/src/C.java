import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C {

	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("src\\input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int j = 0; j < T; j++) {
			 st = new StringTokenizer(br.readLine(), " ");
			
			int idx = Integer.parseInt(st.nextToken()) - 1;
			char[] arrChar = st.nextToken().toCharArray();

			// System.out.println(Arrays.toString(arrChar));
			// System.out.println('(' + ')');

			int sum = 0; // '(' + ')' = 81
			boolean noPair = false;
			if (arrChar[idx] == '(') {
				for (int i = idx; i < arrChar.length; i++) {
					sum += arrChar[i];
					if (sum % 81 == 0) {
						System.out.println(i + 1);
						noPair = true;
						break;
					}
				}
			} else {
				for (int i = idx; i >= 0; i--) {
					sum += arrChar[i];
					if (sum % 81 == 0) {
						System.out.println(i + 1);
						noPair = true;
						break;
					}
				}
			}

			if (noPair == false) {
				System.out.println(0);
			}

		}
	}
}
