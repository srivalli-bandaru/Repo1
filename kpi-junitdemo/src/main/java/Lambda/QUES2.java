package Lambda;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class QUES2 {

	public static void checkingChronoEnum() {
		LocalDate date1 = LocalDate.now();
		LocalDate year = date1.plus(8,ChronoUnit.YEARS);
		System.out.println("Date on :"+year);
		try {
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy",java.util.Locale.ENGLISH);
			java.util.Date date = sdf.parse("07/10/2030");
			sdf.applyPattern("EEE,d MMM YYYY");
			String str = sdf.format(date);
			System.out.println(str);
		
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		checkingChronoEnum();
	}
}
