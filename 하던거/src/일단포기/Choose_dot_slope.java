package 일단포기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Choose_dot_slope {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 점의 개수 입력받아서 이중배열 생성
		int numberOfDots = sc.nextInt();
		int[][] arr = new int[numberOfDots][2];		
		
		
		// 점의 수만큼 x, y좌표 입력받아 이중배열에 넣기
		for (int i=0; i<arr.length; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		
		// 한 점에서 다른 모든 점들과의 기울기 값을 넣을 배열 생성
		double[] arrSlope = new double[compareCount(numberOfDots)];
		int arrSlopeIdx = 0;
		
		
		// 모든 기울기를 배열에 넣음 
		for (int i=0; i<arr.length-1; i++) {
			for (int j=i+1; j<arr.length; j++) {
				double slope = (double)(arr[i][1] - arr[j][1])/(arr[i][0] - arr[j][0]);
				arrSlope[arrSlopeIdx] = slope;
				arrSlopeIdx++;
			}
		}
		System.out.println(Arrays.toString(arrSlope));
		
		
		// 중복값 개수 확인을 위해 정렬
		Arrays.sort(arrSlope);
		
		
		// 중복값 개수 넣을 리스트 생성
		ArrayList<Integer> cntList = new ArrayList<Integer>();
		
		
		// 중복값 개수 체크해서 리스트에 넣기.
		int cnt = 0;
		for (int i=0; i<arrSlope.length-1; i++) {
			if (arrSlope[i] == arrSlope[i+1]) {
				cnt++;
				if (i == arrSlope.length-2) {  // 마지막과 그전이 같을경우
					cntList.add(cnt+1);
				}
			} else {
				if (cnt != 0) {
					cntList.add(cnt+1);
				}
				cnt = 0;
			}
		}
		
		for (int i=0; i<cntList.size(); i++) {
			System.out.print(cntList.get(i) + " ");
		}
		System.out.println();
		
		// cntList 정렬
		cntList.sort(null);
		
		
		// 가장 마지막 요소가 최대 cnt!
		int cntMax = cntList.get(cntList.size()-1);
		System.out.println("cntMax" + cntMax);
		
		// 기울기의 개수 -> 점의 개수
		int result = 3;
		for (int i=3; i<1001; i++) {
			if (compareCount(i) == cntMax) {
				result = i;
			}
		}
		
		
		// 최종결과 출력
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		for (int i=0; i<arr.length; i++) {
//			for (int j=0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//		

		
	}
	
	static int compareCount(int i) {
		
		if (i==1) {
			return 0;
		} else {
			return i-1 + compareCount(i-1);			
		}	
		
	}
}
