import java.util.Scanner;

public class SMUPC계산기_21737 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// S: -,  M: *,  U: /,  P: +,  C: =  
		
		// 3S2C -> 3-2 = 1
		sc.nextLine();
		String str = sc.nextLine();
		String tmp = "";
		int left, right, res = 0;
		char target;
		for (int i=0; i<str.length(); i++) {
			target = str.charAt(i);
			
			if (target == '0') {
				continue;
			}
			
			if (target == 'C') {
				System.out.print(tmp + " ");
				
			} else if (target == 'S') {
				left = Integer.parseInt(tmp);
				i++;
				tmp = "";
				if (i == str.length())  break;
				while(str.charAt(i) != 'S' && str.charAt(i) != 'M' && str.charAt(i) != 'U' && str.charAt(i) != 'P' && str.charAt(i) != 'C') {
					tmp += str.charAt(i);
					i++;
				}
				right = Integer.parseInt(tmp);
				res = left - right;
				tmp = Integer.toString(res);
				i--;
				
			} else if (target == 'M') {
				left = Integer.parseInt(tmp);
				i++;
				tmp = "";
				if (i == str.length())  break;
				while(str.charAt(i) != 'S' && str.charAt(i) != 'M' && str.charAt(i) != 'U' && str.charAt(i) != 'P' && str.charAt(i) != 'C') {
					tmp += str.charAt(i);
					i++;
				}
				right = Integer.parseInt(tmp);
				res = left * right;
				tmp = Integer.toString(res);
				i--;
				
			} else if (target == 'U') {
				left = Integer.parseInt(tmp);
				i++;
				tmp = "";
				if (i == str.length())  break;
				while(str.charAt(i) != 'S' && str.charAt(i) != 'M' && str.charAt(i) != 'U' && str.charAt(i) != 'P' && str.charAt(i) != 'C') {
					tmp += str.charAt(i);
					i++;
				}
				right = Integer.parseInt(tmp);
				if (left < 0) {
					left = left * -1;
					res = left / right;
					res = res * -1;
				} else {					
					res = left / right;
				}
				tmp = Integer.toString(res);
				i--;
				
			} else if (target == 'P') {
				left = Integer.parseInt(tmp);
				i++;
				tmp = "";
				if (i == str.length())  break;
				while(str.charAt(i) != 'S' && str.charAt(i) != 'M' && str.charAt(i) != 'U' && str.charAt(i) != 'P' && str.charAt(i) != 'C') {
					tmp += str.charAt(i);
					i++;
				}
				right = Integer.parseInt(tmp);
				res = left + right;
				tmp = Integer.toString(res);
				i--;
				
			} else {
				tmp += target;				
			}
		}
		
		if (tmp.equals("")) {
			System.out.println("NO OUTPUT");			
		}
		
		
	}
}
