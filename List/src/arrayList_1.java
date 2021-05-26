
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrayList_1 {

	public static void main(String[] args) {
		
		// 기본문형1
		ArrayList temp = new ArrayList();
	 // 한국타이어                 한국타이어
		
		// 요게 더 유연하게 쓰인다. 이렇게 써라.
		List temp2 = new ArrayList();
     // 타이어             한국타이어    new LinkedList();로 갈아끼움
									 // 금호타이어
		// Generic
		// 제네릭을 잡아주면 버그를 컴파일시 잡아준다. (Integer로 잡고 문자열 넣으면 버그뜸)
		// 안잡아주면 런타임시 애러가 뜬다.
		List<Integer> mylist = new ArrayList<Integer>();
	 // 자동차<스노우>              한국타이어<스노우>
		                 
		System.out.println(mylist.size());	// 0
		mylist.add(1);
		mylist.add(2);
		mylist.add(3);
		System.out.println(mylist.get(0));	// 1
		System.out.println(mylist.size());	// 3
		mylist.remove(0);
		System.out.println(mylist.get(0));  // 2
		System.out.println(mylist.size());	// 2
		System.out.println();
		

		
		// 실무유형 1
		Iterator it = mylist.iterator();
		while(it.hasNext()) {
			// int value = (int) it.next();
			System.out.println(it.next());	
			System.out.println(it.getClass().getName());  // java.util.ArrayList$Itr
		}
		System.out.println();
		
		// 실무유형 2
		for(Integer ob : mylist) {		// 제네릭이 없으면 Integer -> Object
			System.out.println(ob);
			System.out.println(ob.getClass().getName());  // java.lang.Integer
		}
		System.out.println();
		
		// 요즘 추세
		for (int i=0; i<mylist.size(); i++) {
			System.out.println(mylist.get(i));
		}
		

		
		
		
		// 실무유형 2
		
		// 실무유형 3
	}
}
