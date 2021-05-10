import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		if (s.contains("one")) {
			s = s.replaceAll("one", "1");
		}
		
		if (s.contains("two")) {
			s = s.replaceAll("two", "2");
		}
		
		System.out.println(s);
		
	}
	
	
}
