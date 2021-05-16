import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {
	
// S: -,  M: *,  U: /,  P: +,  C: =  

// 3S2C -> 3-2 = 1
		
/*
5
3S2M3U1P2C
>
5


4
0328CS00325CC
>
328 3 3
 */

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		// 계산  // S: -,  M: *,  U: /,  P: +,  C: =  
		int n = Integer.parseInt(bf.readLine());
		String s = bf.readLine();
		// 15 3
		int[] arrInt = new int[n+1];	// n+1은 C가 없을경우 고려.
		char[] arrChar = new char[n];
		
//		System.out.println(Arrays.toString(arrInt));
//		System.out.println(Arrays.toString(arrChar));
		
		// 수와 문자 각각 배열에 넣기
		String tmpNum = "";
		boolean is_number = false;
		int idxInt = 0, idxChar = 0; 
		
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				tmpNum += s.charAt(i);
				is_number = true;
			} else {
				if (is_number) {
					arrInt[idxInt++] = Integer.parseInt(tmpNum);
					arrChar[idxChar++] = s.charAt(i);
					tmpNum = "";
					is_number = false;
				} else {
					arrChar[idxChar++] = s.charAt(i);
				}
			}
		}
		
//		System.out.println(Arrays.toString(arrInt));
//		System.out.println(Arrays.toString(arrChar));
		
		// 계산  // S: -,  M: *,  U: /,  P: +,  C: =  
		idxInt = 1;
		int cntC = 0;
		for (int i=0; i<arrChar.length; i++) {
			if (arrChar[i] == 'S') {
				arrInt[0] -= arrInt[idxInt++]; 
			} else if (arrChar[i] ==  'M') {
				arrInt[0] *= arrInt[idxInt++]; 
			} else if (arrChar[i] ==  'U') {
				arrInt[0] /= arrInt[idxInt++]; 
			} else if (arrChar[i] ==  'P') {
				arrInt[0] += arrInt[idxInt++]; 
			} else {
				System.out.print(arrInt[0] + " ");	
				 cntC++;
			}
		}
		
		if (cntC == 0) {
			System.out.println("NO OUTPUT");
		}

	}
}

