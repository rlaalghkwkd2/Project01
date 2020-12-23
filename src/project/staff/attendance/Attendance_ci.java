package project.staff.attendance;

import java.util.Calendar;

public class Attendance_ci {
	Calendar cal = Calendar.getInstance();
	int year = cal.get(Calendar.YEAR);
	int month = cal.get(Calendar.MONTH) + 1;
	int day = cal.get(Calendar.DAY_OF_MONTH);
	int hour = cal.get(Calendar.HOUR_OF_DAY);
	int min = cal.get(Calendar.MINUTE);
	int count = 0;
	// count 0: ����, 1: ����, 2: �Ἦ
	String date = String.format("%d%d%d%d%d%d", year, month, day, hour, min, count);
	
	public Attendance_ci() {		
		if (hour < 24 && hour >= 0 && min < 60 && min >= 0) {
			if (!((hour == 9 && min > 9) || (hour > 9))) {
			} else {
				if (hour >= 15) {
					count += 2;
				} else {
					count += 1;
				}
			}
		}
	}
	
	public String check_time() {

		return String.format("%d��%d��", hour, min);
	}
	
	public String check_day() {
		
		return String.format("%d��%d��%d��", year, month, day);
	}
	
	public String attendance_result() {	
		if (count == 0) {
			return "����";
		} else if (count == 1) {
			return "����";
		} else {
			return "�Ἦ";
		}	
	}
	
	public int atd_int() {
		
		return count;
	}
}












