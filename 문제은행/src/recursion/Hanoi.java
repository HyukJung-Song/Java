package recursion;


/*
start  pass  goal
  A     B     C
  |     |     |
 
n = 1
A -> C

n = 2
A -> B (n=1)
A -> C (n=2)
B -> C (n=1)

 */

public class Hanoi {
	
	static int cnt = 0;
	static void path(int N, char START, char GOAL) {
		cnt++;
		System.out.printf("'%d'원반을 %c -> %c  // %d\n", N, START, GOAL, cnt);
	}
	static void hanoi(int N, char START, char GOAL, char PASS) {
		if (N==1) {
			path(N, START, GOAL);
		} else {
			hanoi(N-1, START, PASS, GOAL);
			path(N, START, GOAL);
			hanoi(N-1, PASS, GOAL, START);
		}
	}
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		hanoi(15, 'A', 'C', 'B');
		long end = System.currentTimeMillis();
		System.out.println("경과시간: " + (end - start));
	}
	
}


