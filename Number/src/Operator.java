
public class Operator {

	public static void main(String[] args) {
		
		
		// 삼항연산자
		for (int i=0; i<2; i++) {
			String name = (i==0)? "Student1":"Student2";
			System.out.println(i + " name" + name);
		}	
			
		// 증감연산자
		int a = 1;
		int b = a++;
		int c = a;
		System.out.println("a : " + a);		// 2
		System.out.println("b : " + b);		// 1	
		System.out.println("c : " + c);		// 2
		
		
		
	}
}
