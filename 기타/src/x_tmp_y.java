

public class x_tmp_y {
	public static void main(String[] args) {
		
	int x = 1;
	int y = 2;
	int tmp = 0;;
	
	tmp = x;	// 무조건 tmp = ? 로 시작해야 한다.
	x = y;
	y = tmp;
	
	System.out.println("x: " + x);
	System.out.println("y: " + y);
	
	}
}
