import java.util.Arrays;

public class Caution {

	public static void main(String[] args) {
		
		// 자주 실수하는거
		System.out.println(1 + "1");			// 11
		
		// 유용한 메소드
		System.out.println(Math.min(9, 1));		// 1
		
		// 인덱스 찾기
		int[] arr = {1,2,3};
		String str = "123";
		System.out.println(Arrays.binarySearch(arr, 3));
		System.out.println(str.indexOf("2"));
		
		// 자료형 검색
		// 객체.getClass().getName()
		
		
		

	}
}
