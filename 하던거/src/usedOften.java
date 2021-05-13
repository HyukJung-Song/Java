import java.util.Arrays;
import java.util.stream.Stream;

public class usedOften {

	public static void main(String[] args) {				
		
		// 자주 실수하거나 아리까리한거
		System.out.println(0/2);				// 0
		System.out.println(0%2);				// 0
		System.out.println(1 + "1");			// 11
		System.out.println();
		
		
		// 알아두면 편한거
		int a = (1 > 0)? 77:88;					// 77 (삼항연산자)
		
		
		
		// Math
		System.out.println(Math.min(9, 1));		// 1
		System.out.println(Math.pow(3, 3));		// 27.0(double임)
		System.out.println(Math.round(2.456*100)/100.0);	// 2.46
		System.out.println(Math.ceil(2.1));		// 3.0 (2.0은 2.0임)
		System.out.println(Math.floor(2.1));	// 2.0 (역시 2.0은 2.0임)
		System.out.println();
		
		
		// int <-> String
		String s = "11";
		int s1 = Integer.parseInt(s);
		System.out.println(s1);
		String s2 = Integer.toString(s1);
		System.out.println(s2);
		System.out.println();
		
		
		// char
		char c1 = 'a';
		System.out.println(c1);			// a
		char c2 = 97;
		System.out.println(c2);			// a
		System.out.println((char)97);	// a
		int i1 = c1;
		System.out.println(i1);			// 97
		
		
		// String
		String str = "12 서울";		
		// System.out.println(str[0]); (x)
		System.out.println(str.charAt(4));					// 울
		System.out.println(str.contains("서울"));	 		// true
		System.out.println(str.replaceAll("서울", "제천"));	// 12 제천 (str = str.replac~~ 로 해야 변경됨)
		System.out.println(str);							// 12 서울 
		// String -> char[]
		char[] charArr = str.toCharArray();
		System.out.println(Arrays.toString(charArr));		// [1, 2,  , 서, 울]
		System.out.println();
		System.out.println();

		
		

		
		
		// String[]
		String str1 = "3 2 1";
		String[] strArr = str1.split(" ");						// ["3", "2", "1"]
		System.out.println(Arrays.toString(strArr));			// ["3", "2", "1"]  [3, 2, 1]으로 출력됨
		// String[] -> int[]
		int[] intArr = Stream.of(strArr).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));					// [1, 2, 3]
		// 배열요소만 꺼내 출력하기.
		Arrays.stream(intArr).forEach(System.out::print);				// 123
		System.out.println();
		Arrays.stream(intArr).forEach(x->{System.out.print(x+" ");});	// 1 2 3
		System.out.println();
		for (int element : intArr) {
			System.out.print(element + " ");							// 1 2 3
		}
		System.out.println("\n");
		
	
		// arr
		int[] array = {}; // -> 이렇게 초기화를 하면 안된다. 
		                  // 길이가 0이기에 array[0] = 1은 되는데 실행하면 
		                  // indexOutOfBound뜸.
		
		
		// arr <-> String
		int[] arr = {1,2,3};
		String str2 = "1 2 3";
		// 길이구하기
		System.out.println(arr.length);		// 3
		System.out.println(str2.length());	// 5
		// 인덱스 찾기
		System.out.println(Arrays.binarySearch(arr, 3));	// 2
		System.out.println(str2.indexOf("2"));				// 2
		System.out.println();
		
		
		// 실행시간 측정
		long start = System.currentTimeMillis();
		// ... 로직 ...
		long end = System.currentTimeMillis();
		System.out.println("수행시간: " + (end - start) + " ms");
		System.out.println();
		
		
		// 잠시 정지시키기
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// 자료형 검색
		// 객체.getClass().getName()
		
		
		
		

	}
}
