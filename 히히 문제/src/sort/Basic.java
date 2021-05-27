package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Basic {

	public static void main(String[] args) {
		
		int[] arr = new int[30];
		
		for(int i=0; i<arr.length; i++) {
			Random r = new Random();
			int num = r.nextInt(101);
			arr[i] = num;					// 30사이즈의 배열에 랜덤숫자 넣음
		}
		
		// 오름차순(sort)
		// sort() 메서드는 클래스 메서드(Class method / Static method)로써 Arrays 클래스의 인스턴스 생성없이 바로 사용하시면 됩니다.
		// 참고로 기본 정렬조건이 오름차순 인 이유는 Class 내에 기본적으로 구현되어있는 Comparable Interface의 compareTo 메서드를 기준으로 하기 때문입니다. 
		// Java에서 인스턴스를 서로 비교하는 클래스들은 모두 Comparable 인터페이스가 구현 되어 있습니다.
		System.out.println(Arrays.toString(arr));	// 정렬 전
		Arrays.sort(arr);	
		System.out.println(Arrays.toString(arr));	// 정렬 후
		System.out.println();
		
		
		
		Integer[] arr2 = new Integer[30];
		
		for(int i=0; i<arr.length; i++) {
			Random r = new Random();
			int num = r.nextInt(101);
			arr2[i] = num;					// 30사이즈의 배열에 랜덤숫자 넣음
		}
		// 내림차순(Collection 클래스 사용)
		// 이는 Arrays 클래스의뿐만아니라 다른 자료 구조나 Comparable Stream등 콜렉션(Collection)을 다루는 정렬 메서드에 대부분 적용 할 수 있습니다.
		// 주의할 점은 byte, char, double, short, long, int, float같은  PrimitiveType의 배열에는 적용이 불가능하니 
		// Integer같은 Wrapper "Class"를 이용하셔야 한다는 점입니다.
		System.out.println(Arrays.toString(arr2));	// 정렬 전
		Arrays.sort(arr2, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr2));	// 정렬 후

		
	}
}
