package method;

import java.util.Arrays;
import java.util.Random;

public class Method_2 {

	public static void main(String[] args) {
		int[] score = {0,0,0,0,0,0,0,0,0,0};
		insertNumber(score);
		Arrays.sort(score);
		System.out.println(Arrays.toString(score));
		
//		int[] score2 = new int[10];
//		insertNumber(score2);
//		System.out.println(Arrays.toString(score2));
		
		int total = calcScore(score);
		System.out.println("총합: " + total);
	}
	
	
	public static void insertNumber(int[] s) {
		Random r1 = new Random();
		for (int i=0; i<s.length; i++) {
			s[i] = r1.nextInt(11);
		}
	}
	
	public static int calcScore(int[] s) {
		int total = 0;
		for (int i=0; i<s.length; i++) {
			total = total + s[i];
		}
		// System.out.println("총합: " + total);
		return total;
	}
}
