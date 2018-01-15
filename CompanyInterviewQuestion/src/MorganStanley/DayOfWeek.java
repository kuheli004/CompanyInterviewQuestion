package MorganStanley;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DayOfWeek {

	public static void main(String[] args) throws ParseException {
	String today="01/01/2018";
DateFormat sd=new SimpleDateFormat("dd/mm/yyyy");
Date d=sd.parse(today);
Calendar c=Calendar.getInstance();
c.setTime(d);
int dow=c.get(c.DAY_OF_WEEK);
	
	switch(--dow) {
	case 0:
		System.out.println("Sunday");
		break;
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("Tuesday");
		break;
	case 3:
		System.out.println("Wednesday");
		break;
	case 4:
		System.out.println("Thursday");
		break;
	case 5:
		System.out.println("Friday");
		break;
	case 6:
		System.out.println("Saturday");
		break;
	
	
	}

	}

}
