package 몫_나머지;
import java.util.Scanner;


public class Greedy_coin_2 {

	// # 14916
	public static void main(String[] args) {
		
		/*
		 3 > -1
		 10 > 2
		 13 > 5
		 14 > 4
		 
		 거스름돈 최소갯수(2원과 5원)
		
		 */

		Scanner sc = new Scanner(System.in);
		
		int change = sc.nextInt();
		int cnt = -1;
		
		if (change % 5 == 0) {
			cnt = change / 5;
		} else {
			int cnt2 = change/2;
			for (int i=0; i<cnt2; i++) {
				int n = i+1;
				if ((change-(2*n))%5 == 0) {
					cnt = 0;
					cnt += n;
					cnt += (change-(2*n))/5;
					break;
				} 
			}
		}
		System.out.println(cnt);
	}
	
/*
import java.util.Scanner;

public class BOJ_CoinChange_14916{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt(); 
        int numberOfCoin = 0;
        
        if(input % 5 == 0) {
            System.out.println(input / 5);
        } else {
            while(true) {
           
                if(input < 0) {
                    System.out.println(-1);
                    break;
                }
                
                if(input == 0) {
                    System.out.println(numberOfCoin);
                    break;
                }
                
                input -= 2;
                numberOfCoin++;
                
                if(input % 5 == 0) {
                    numberOfCoin += input / 5;
                    System.out.println(numberOfCoin);
                    break;
                }
            }
        }
        sc.close();
    }
}

*/
}
