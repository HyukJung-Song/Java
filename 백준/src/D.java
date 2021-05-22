import java.text.SimpleDateFormat;
import java.util.Calendar;

public class D {

	public static void main(String[] args) {
		
		
		long a = 10;
		a = a + '9' - '0';
		System.out.println(a);
		System.out.println('3');
		System.out.println('0');
		System.out.println('3'-'0');
		
		SimpleDateFormat sdf = new SimpleDateFormat("MMdd");
		String now = sdf.format(Calendar.getInstance().getTime());
		System.out.println(now);
		

		

		
	}
}
