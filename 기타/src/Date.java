

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {

	public static void main(String[] args) {
		
		// 현재 날짜
		SimpleDateFormat sdf = new SimpleDateFormat("MMdd");
		String now = sdf.format(Calendar.getInstance().getTime());
		System.out.println(now);	// 0526
		sdf = new SimpleDateFormat("yyyy MMdd");
		now = sdf.format(Calendar.getInstance().getTime());
		System.out.println(now);	// 2021 0526
		sdf = new SimpleDateFormat("yy MMdd");
		now = sdf.format(Calendar.getInstance().getTime());
		System.out.println(now);	// 21 0526
		sdf = new SimpleDateFormat("HH:mm:ss");
		now = sdf.format(Calendar.getInstance().getTime());
		System.out.println(now);	// 23:37:00
		sdf = new SimpleDateFormat("hh:mm:ss");
		now = sdf.format(Calendar.getInstance().getTime());
		System.out.println(now);	// 11:37:35
	}
}
