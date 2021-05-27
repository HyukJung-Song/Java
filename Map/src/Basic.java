

import java.util.HashMap;

public class Basic {

/*
 
 - Map은 사전과 비슷하게 Key와 Value를 한 쌍으로 갖는 자료형이다.
   대부분의 언어들이 가지고 있는 자료형으로 Associative array, Hash라고도 불린다.
 - List나 Array처럼 순차적으로(sequential) 해당 요소 값을 구하지 않고 Key를 통해 Value를 얻는다.
 - Map도 List와 마찬가지로 인터페이스이다. Map 인터페이스를 구현한 Map 자료형에는
   HashMap, LinkedHashMap, TreeMap등이 있다.
 - LinkedHashMap은 입력된 순서대로 데이터가 출력된다.
   TreeMap은 입력된 key에 의해 소트된 데이터가 출력된다.
 
 */

	public static void main(String[] args) {
		
		
		// put - key와 value입력하기.
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("people", "사람들");
		map.put("dog", "강아지");
		
		
		// get - key를 통해 value 얻기
		System.out.println(map.get("dog"));		// 강아지
		
		
		// containsKey - true/false 출력됨
		System.out.println(map.containsKey("people"));	// true
		System.out.println(map.containsKey("cat"));		// false
		
		
		// remove - 삭제후 삭제된 key의 value값 리턴
		System.out.println(map.remove("people"));	// 사람들
		
		
		// size
		System.out.println(map.size());		// 1
		
		
		
		
		
		
		
		
		
		
		
	}
}
