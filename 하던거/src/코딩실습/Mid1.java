package 코딩실습;

import java.util.Scanner;

public class Mid1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = Integer.parseInt(sc.nextLine());
		
		String[] s = new String[T];
		for (int i=0; i<T; i++) {
			s[i] = sc.nextLine();
		}
		
		for (int i=0; i<s.length; i++) {
			int cnt = 0;
			for (int j=0; j<s[i].length(); j++) {
				if (s[i].charAt(j) == 'A') {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		
		
	}
}
