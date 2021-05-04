package c0504_2;



public class Exec {
	public static void main(String[] args) throws Exception {
		java.util.Scanner sc = new java.util.Scanner(System.in);  // 이렇게 쓸 수도 있다.
		
		java.util.Date date1 = new java.util.Date();	// 다른 패키지 둘다 사용할 경우
		java.sql.Date date2 = new java.sql.Date(0);
		
		com.kopo.Test t1 = new com.kopo.Test();
		
		int a = 10;			// 기본데이터(객체로 가는게 boxing, 반대가 unboxing)
		Integer a1 = 20;	// 객체데이터
		double b = 20;
		Double b2 = new Double(2.0);
		
		// 4자리 숫자표시
		for (int i=0; i<20; i++) {
//			System.out.println(i);
//			String tmpStr = String.format("%4d", i);	// ()()()0
			String tmpStr2 = String.format("%04d", i);	// 0000
			System.out.println(tmpStr2);
		}
		
		// 애러처리 개별로 나눠서
		try {			
			int a2 = 10 / 0;
			int a3 = Integer.parseInt("10a");
		} catch (ArithmeticException e) {		
			System.out.println("ERROR!!!  0으로 나눔");
		} catch (NumberFormatException e) {
			System.out.println("ERROR!!!  숫자포맷이 안맞음!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		// throw
		// Test 클래스에서 바로 try catch를 하거나
		// throw를 해서 애러처리를 호출한 곳으로 넘김
		// 그러면 아래 애러표시 뜨고 그걸 또 메인으로 넘김
		// 결국 컴퓨터가 메인 실행시 거기서 예외처리 하게됨.
		// 왠만하면 바로 try catch로 할것.
		t1.doAction(0);		
		
		
		
		 
		
	}
}
