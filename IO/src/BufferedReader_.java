import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader_ {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// String[] 
		String[] strs = br.readLine().split(" ");
		int a = Integer.parseInt(strs[0]);
		System.out.println(a);
		
		  
	}
}
