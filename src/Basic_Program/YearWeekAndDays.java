package Basic_Program;

import java.util.Scanner;

public class YearWeekAndDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double days,years,weeks;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the days");
		days=in.nextDouble();
		
		years= days/365;
		weeks= (days % 365) / 7;
		days = days - ((years * 365) + (weeks * 7));
		
		System.out.println("In years"+years);
		System.out.println("In weeks"+ weeks);
		System.out.println("In days "+ days);

	}

}
