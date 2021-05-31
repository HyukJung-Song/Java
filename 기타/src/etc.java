
public class etc {

	public static void main(String[] args) {
		
		// 객체 자료형 검색
		// 객체.getClass().getName()
		
		
		// x <=> y
		int x = 1, y = 2, tmp = 0;
		
		tmp = x;	// 무조건 tmp = ? 로 시작해야 한다.
		x = y;
		y = tmp;
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		
		// 실행시간 측정
		long start = System.currentTimeMillis();
		// ... 로직 ...
		long end = System.currentTimeMillis();
		System.out.println("수행시간: " + (end - start) + " ms");
		System.out.println();
		
		
		// 잠시 정지시키기
		int i = 1;
		while (true) {
			System.out.println("number" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
		
	}
}
