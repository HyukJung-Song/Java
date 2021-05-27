package z_etc;

import java.util.Arrays;
import java.util.Random;

public class sleep {

	public static void main(String[] args) {


		int i = 1;
		while (true) {
			System.out.println("song " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
		
	}
	

	
}
