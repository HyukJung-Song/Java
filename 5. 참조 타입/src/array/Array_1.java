package array;

import java.util.Arrays;

public class Array_1 {
	
	public static void main(String[] args) {
		
	// 다양한 배열의 모습
	int[] ar = {1,2,3};
	char[] ar2 = {'a', 'b', 'c'};
	String[] ar3 = {"aa", "bb", "cc"};
	Integer[] ar4 = {1,2,3,4};		// Wrapper Class
	Double[] ar5 = {1.1, 2.1, 3.1};
	
	
	// 배열 초기화
	int[] arr = {1,2,3,4,5};	// 값 넣어주면서 초기화, (x)[1,2,3,4,5])
	int[] arr2 = new int[5];	// 값 없이 초기화
	
	
	// 배열 내용 및 길이
	System.out.println(Arrays.toString(arr));	// 배열 내용확인
	System.out.println(arr.length);	// 배열 길이확인
	System.out.println();
	

	
	// 레퍼런스(주소값) 복사 (값 없이 new로 초기화해도 결과 같음)
	// 왠만하면 쓰지 말것
	int[] array = {1,2,3,4,5};	// 기본타입
	int[] array2 = array;			
	array2[4] = 555;
	System.out.println(array[4]);	// 555
	System.out.println(array);		// [I@3830f1c0
	System.out.println(array2);		// [I@3830f1c0
	System.out.println();
	
	Integer[] a = {1,2,3};		// Wrapper Class
	Integer[] a2 = a;
	System.out.println(a);	// [Ljava.lang.Integer;@39ed3c8d
	System.out.println(a2); // [Ljava.lang.Integer;@39ed3c8d
	System.out.println();
	
	
	// 주소값이 아닌 실제값 복사
	int[] array3 = {1,2,3,4,5};
	int[] temp3 = new int[array3.length];
	System.arraycopy(array3, 0, temp3, 0, array3.length); // 전체복사
	System.out.println(Arrays.toString(array3));  // [1,2,3,4,5]
	System.out.println(Arrays.toString(temp3));    // [1,2,3,4,5]
	System.out.println(array3);		// [I@71dac704
	System.out.println(temp3);		// [I@123772c4
	System.out.println();
	
	String[] array4 = {"aa", "cc", "bb"};
	String[] temp4 = new String[5];
	String[] temp5 = {"", "", "zz", "", "xx"};
	System.arraycopy(array4, 1, temp4, 2, 2);
	System.out.println(Arrays.toString(array4));
	System.out.println(Arrays.toString(temp4));	// [null, null, cc, bb, null]
	System.out.println(array4);	// [Ljava.lang.String;@2d363fb3
	System.out.println(temp4);	// [Ljava.lang.String;@2d363fb3
	System.out.println();
	System.arraycopy(array4, 1, temp5, 2, 2);
	System.out.println(Arrays.toString(array4));
	System.out.println(Arrays.toString(temp5));	// [, , cc, bb, xx]
	System.out.println(array4);	// [Ljava.lang.String;@2d363fb3
	System.out.println(temp5);	// [Ljava.lang.String;@5aaa6d82
	System.out.println();
	
	

	
	}
}
