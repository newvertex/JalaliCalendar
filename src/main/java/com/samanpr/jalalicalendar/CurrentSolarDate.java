
import java.util.Calendar;

public class CurrentSolarDate {
	
	private static String _date;
	
	public CurrentSolarDate() {
		
	}
	
	public static String CurrentDate() {
		
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int month = Calendar.getInstance().get(Calendar.MONTH);
		int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		_date = JalaliCalendar.gregorianToJalali(new JalaliCalendar.YearMonthDate(year, month, day)).toString();
		
		return _date;
	}
}
