
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class B {

	public static void main(String[] args) {

		// 랜덤배열 생성
		Random r = new Random();
		int[] arr = new int[10];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(10) + 1;
		}
		System.out.println("arr: " + Arrays.toString(arr));
		
		
		// 중복값 제거를 위해서 tmp베열에 값 증가시키기
		int[] tmpArr = new int[11];
		for (int i=0; i<arr.length; i++) {
			tmpArr[arr[i]]++;
		}
		System.out.println("tmpArr: " + Arrays.toString(tmpArr));
		
		
		// 중복값 제거한 값들 넣을 배열 생성
		int cnt = 0;
		for (int i=0; i<tmpArr.length; i++) {
			if (tmpArr[i] != 0) {
				cnt++;
			}
		}
		int[] arr2 = new int[cnt];
		System.out.println("cnt: " + cnt);
		
		
		// 중복 제거값들 넣기
		int idx = 0;
		for (int j=0; j<tmpArr.length; j++) {
			if (tmpArr[j] != 0) {
				arr2[idx] = j;
				idx++;
			}
		}
		System.out.println("arr2: " + Arrays.toString(arr2));
		
		// 버블소트
		for (int i=0; i<arr.length-1; i++) {
			for (int j=1; j<arr.length; j++) {
				if (arr[j-1]>arr[j]) {
					int tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("정렬된 arr" + Arrays.toString(arr));
		



	}
}
