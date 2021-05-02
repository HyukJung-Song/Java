package 새로운_생각;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Snail_2869 {

	// 2869
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");		

		int up = Integer.parseInt(st.nextToken()); // 5 (낮+)
		int down = Integer.parseInt(st.nextToken()); // 2 (밤-)
		int tree = Integer.parseInt(st.nextToken()); // 8 (나무)

		// 1  5 3
		// 2    8 6
		// 3      11 9
		
		int day = (tree-down) / (up-down); 
		
		if ((tree-down) % (up-down) != 0) {
			day++;
		}
		
		System.out.println(day);
	}
	
	
}
