package project.staff.attendance;

import java.util.Calendar;

public class Today {
	Calendar cal = Calendar.getInstance();
	int year = cal.get(Calendar.YEAR);
	int month = cal.get(Calendar.MONTH) + 1;
	int day = cal.get(Calendar.DAY_OF_MONTH);
	
public String check_day() {
		
		return String.format("%d��%d��%d��", year, month, day);
	}
}
