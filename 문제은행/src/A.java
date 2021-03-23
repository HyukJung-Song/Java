import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		
		int[] arr = new int[30];
		
		for(int i=0; i<arr.length; i++) {
			Random r = new Random();
			int num = r.nextInt(101);
			arr[i] = num;					// 30사이즈의 배열에 랜덤숫자 넣음
		}
		
		// 버블정렬
		System.out.println(Arrays.toString(arr)); 	// 정렬 전
		int temp;
		for(int i=0; i<arr.length-1; i++) {			// 왼쪽부터 2개씩 값 비교하여 크면 오른쪽으로 이동
			for(int j=0; j<arr.length-1-i; j++) {	// 제일 오른쪽부터 가장 큰 수가 확정되어 반복을 i번함
				if (arr[j] > arr[j+1]) {			
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}											// 오름차순 정렬완료. (<는 내림차순)
		
		System.out.println(Arrays.toString(arr));	// 정렬 후
	}
}


//// 오름차순(sort)
//System.out.println(Arrays.toString(arr));	// 정렬 전
//Arrays.sort(arr);	// ������������ ������
//System.out.println(Arrays.toString(arr));	// 정렬 후
//System.out.println();
//


//// 내림차순(Collection 클래스 사용)
//System.out.println(Arrays.toString(arr));	// 정렬 전(오름차순 되어있음)
//Arrays.sort(arr, Collections.reverseOrder());
