import java.util.Calendar;

public class PrintWednesdayInMonth {

	
	public static void printWed(int year ,int month)
	{
		Calendar calendar=Calendar.getInstance();
		calendar.set(year, month-1,1);
		
		int DayInMonth=calendar.getActualMaximum(calendar.DAY_OF_MONTH);
		
		for(int day=1;day<=DayInMonth;day++)
		{
			calendar.set(year, month-1,day);
			int dayOfWeek=calendar.get(calendar.DAY_OF_WEEK);
			if(dayOfWeek==calendar.WEDNESDAY)
			{
				System.out.println(day);
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year=2023;
		int month=7;
		System.out.println("wed in month");
		printWed(year, month);
	
	}

}
