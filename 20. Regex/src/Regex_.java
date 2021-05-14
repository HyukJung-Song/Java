
public class Regex_ {

	public static void main(String[] args) {
		
		// . -> 어떤 문자 하나를 의미.
		String pattern = "ab.";
		System.out.println("ab".matches(pattern));		// false
		System.out.println("abc".matches(pattern));		// true
		System.out.println("ab0".matches(pattern));		// true
		System.out.println("ab012".matches(pattern));	// false
		System.out.println("ab#".matches(pattern));		// true
		System.out.println();
//		pattern = "ab$";
//		System.out.println("ca".matches(pattern));
//		System.out.println("abb".matches(pattern));
//		System.out.println("cab".matches(pattern));
//		System.out.println("c ab".matches(pattern));
		
		
		// [Tt] -> T,t중 문자 1개
		// ^ -> 문자열의 시작지점
		String res;
		res = "The cat sat on the mat.".replaceAll("[Tt]he", "@");
		System.out.println(res);		// @ cat sat on @ mat.
		res = "The cat sat on the mat.".replaceAll("^[Tt]he", "#");
		System.out.println(res);		// # cat sat on the mat.
		System.out.println();
		
		
		// $ -> 문자열의 종료지점
		res = "The cat sat on the mat. and the cat".replaceAll("cat", "*");
		System.out.println(res);		// The * sat on the mat. and the *
		res = "The cat sat on the mat. and the cat".replaceAll("cat$", "*");
		System.out.println(res);		// The cat sat on the mat. and the *
		System.out.println();
		
		
		// \b단어\b -> 독립적인 단어  (\b는 단어의 경계선을 찾음)  
		// (\ -> \\로 입력)
		res = "This island is beautiful.".replaceAll("is", "%");
		System.out.println(res);		// Th% %land % beautiful.
		res = "This island is beautiful.".replaceAll("\\bis\\b", "%");
		System.out.println(res);		// This island % beautiful.
		System.out.println();
		
		
		// [abc] -> abc중 문자 1개, "-"를 사용하여 범위지정 가능.
		pattern = "[abc][vz]";		// [abc] = [a-c]
		System.out.println("av".matches(pattern));		// T
		System.out.println("ac".matches(pattern));		// F
		pattern = "Ex_[a-g1-5]";
		System.out.println("Ex_g".matches(pattern));	// T
		System.out.println("Ex_4".matches(pattern));	// T
		System.out.println("Ex_g4".matches(pattern));	// F
		System.out.println("Ex_6".matches(pattern));	// F
		
		
		
		
	}
}
