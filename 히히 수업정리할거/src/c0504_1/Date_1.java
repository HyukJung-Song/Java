package c0504_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date_1 {
	public static void main(String[] args) throws ParseException {
		
		// 현재 날짜/시간 출력
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		System.out.println(timeStamp);
		System.out.println(new SimpleDateFormat("yy").format(Calendar.getInstance().getTime()));
		
		System.out.println(Calendar.getInstance().getTimeInMillis());
		System.out.println(Calendar.getInstance().getTime());
		// System.out.println(System.currentTimeMillis());
		System.out.println();
		
		
		// 문자열 -> Date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse("2020-10-01");
		Calendar cal = sdf.getCalendar();
		System.out.println(cal.getTime());
		System.out.println(date);
		System.out.println(date.getTime() + "aaa");
	
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		Date date2 = sdf2.parse("2020-11-21");
		Calendar cal2 = sdf2.getCalendar();
		
		
		// 노가다로 구하기
		long time1 = cal.getTimeInMillis();
		long time2 = cal2.getTimeInMillis();
		
		long diffTime = time2 - time1;
		long days = diffTime / 1000 / 60 / 60 / 24;
		System.out.println(days);
		
		// 1. 기념일 입력 / 2. 오늘로부터 며칠 남았는지 (D-day)
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
		Date endDate = sdf3.parse("2021-07-09");
		Calendar endCal= sdf3.getCalendar();
		long time3 = endCal.getTimeInMillis();
		long now = Calendar.getInstance().getTimeInMillis();
		long diffTime2 = time3 - now;
		long days2 = diffTime2/1000/60/60/24;
		System.out.println("1학기 D-day : " + days2);
		
	}
}
