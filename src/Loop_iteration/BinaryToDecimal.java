package Loop_iteration;

import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc=new Scanner(System.in); 
		 System.out.println("Enter the Number in Binary Format");
		 n=sc.nextInt();
		 
		 int result=0,power=1; 
		 
		 while(n>0){
			 int r=n%10;
			 result=result+power*r;
			 power=power*2;
			 n=n/10;
		 }
		 
		 System.out.println(result);
	}

}
