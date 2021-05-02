import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class D {

	// 2869
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();

		int A = Integer.parseInt(s.split(" ")[0]); // 2 (낮+)
		int B = Integer.parseInt(s.split(" ")[1]); // 1 (밤-)
		int V = Integer.parseInt(s.split(" ")[2]); // 5 (나무)
		
		// 1일 -> 0m -> 2m(A) -> 1m
		// 2일 -> 1m -> 3m(2*A-B) -> 2m
		// 3일 -> 2m -> 4m(3*A-2*B) -> 3m
		// 4일 -> 3m -> 5m((days*A)-((days-1)*B)) 
		
		
		int days = 0;
		int climb = 0;
		while(climb < V) {
			days++;
			climb += A;
			if (climb >= V) {
				break;
			} else {
				climb -= B;
			}
		}
		System.out.println(days);
	}
	
	
}
