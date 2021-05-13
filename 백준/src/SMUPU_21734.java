import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*

smupc
>
sssssss
mmmmmmmmmm
uuuuuuuuu
pppp
cccccccccccccccccc

*/

public class SMUPU_21734 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int tmp, sum;
		for (int i=0; i<str.length(); i++) {
			tmp = (int)str.charAt(i);
			sum = tmp/100 + (tmp%100)/10 + (tmp%100)%10;
			
			for (int j=0; j<sum; j++) {
				System.out.print(str.charAt(i));
			}
			System.out.println();
		}
		
		
		
		
	}
}
