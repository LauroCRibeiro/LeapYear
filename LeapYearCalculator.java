public class LeapYear {
	public static void main(String[] args){
		LeapYearCalculator i = new LeapYearCalculator();
		System.out.println(i.isLeapYear(2016));
		i.displayCalendar(2016);
	}
	
}

public class LeapYearCalculator {
	public boolean isLeapYear(int year){
		if (year%4 == 0 && year%100 == 0 && year%400 == 0){
			System.out.println("Year: " + year + " is LeapYear!!");
			return true;
		}
		System.out.println("Year: " + year + " is not LeapYear!!");
		return false;
	}

	public void displayCalendar(int year){
		for (int month = 1; month <= 12; month++){
			int maxOfDay = tellMeDaysInMonth(month);
            String name = tellMeNameInMonth(month);
			System.out.println(name+ " "+ year);
		    System.out.println("Mo Tu We Th Fr Sa Su");
			 for (int day = 1; day <= maxOfDay; day++){
				// just for visualization
				if (day < 10){
					System.out.print(" ");
				}
				System.out.print(day+ " ");
				
				// break line on week
				if (day%7==0){
					System.out.print("\n");
				}
			}
			
			// break line when the month is finished
			System.out.println("\n");
		}
		
	}
	
	public String tellMeNameInMonth(int month){
		switch(month){
			case 1: return "January";
			case 2: return "February";
			case 3: return "March";
			case 4: return "April";
			case 5: return "May";
			case 6: return "June";
			case 7: return "July";
			case 8: return "August";
			case 9: return "September";
			case 10: return "October";
			case 11: return "November";
			case 12: return "December";
		}
		return "month";
	}
	
	public int tellMeDaysInMonth(int month){
		switch(month){
			case 1: return 31;
			case 2: return 28;
			case 3: return 31;
			case 4: return 30;
			case 5: return 31;
			case 6: return 30;
			case 7: return 31;
			case 8: return 31;
			case 9: return 30;
			case 10: return 31;
			case 11: return 30;
			case 12: return 31;
		}
		return 0;
	}
}