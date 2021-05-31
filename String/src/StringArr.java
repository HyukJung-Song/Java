import java.util.Arrays;
import java.util.stream.Stream;

public class StringArr {

	public static void main(String[] args) {
		
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
		
		
		// int[]과 String[]
		int[] arr = {1,2,3};
		String str2 = "1 2 3";
		// 길이구하기
		System.out.println(arr.length);		// 3	(length는 배열의 길이 -> int[], double[], String[])
		System.out.println(str2.length());	// 5	(length()는 문자열의 길이 -> String, StringBuilder)
		// 인덱스 찾기							//      (size()는 컬렉션프레임워크의 길이 -> ArrayList, Set
		System.out.println(Arrays.binarySearch(arr, 3));	// 2
		System.out.println(str2.indexOf("2"));				// 2
		System.out.println();
	}
}
