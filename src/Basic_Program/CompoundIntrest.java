package Basic_Program;

import java.util.Scanner;
public class CompoundIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double principle,rate,time,compondIntrest;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter principle,time,intrest");
		principle = in.nextDouble();
		time = in.nextDouble();
		rate = in.nextDouble();
		
		compondIntrest = principle * Math.pow((1 + rate / 100), time);
		System.out.println("The compound intrest is "+ compondIntrest );
		
		//principle * pow((1 + rate / 100), time)
	}

}
