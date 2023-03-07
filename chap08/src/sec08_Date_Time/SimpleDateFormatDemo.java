package sec08_Date_Time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a z");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd");

		try {
			d = sdf2.parse("2023-11-30");
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println();
		}

		////////////////////////////////////////
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf3 = new SimpleDateFormat("E yyyy.MM.dd", Locale.US); // Local.US 영어로 날짜가 나옴
		System.out.println(sdf3.format(c.getTime()));
		////////////////////////////////////////
		SimpleDateFormat sdf4 = new SimpleDateFormat("E yyyy.MM.dd", Locale.KOREA);
		System.out.println(sdf4.format(c.getTime()));
		/////////////////////////////////
		LocalDateTime lt = LocalDateTime.now();
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("E yyyy.MM.dd");
//		System.out.println(sdf4.format(lt));
		System.out.println(lt.format(dt));
		System.out.println(dt.format(lt));

	}
}
