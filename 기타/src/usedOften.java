import java.util.Arrays;

public class usedOften {

	public static void main(String[] args) {
		
		
		// 실행시간 측정
		long start = System.currentTimeMillis();
		// ... 로직 ...
		long end = System.currentTimeMillis();
		System.out.println("수행시간: " + (end - start) + " ms");
		
		
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
