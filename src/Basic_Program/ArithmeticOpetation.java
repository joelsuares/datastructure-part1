package Basic_Program;

import java.util.Scanner;
public class ArithmeticOpetation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y,z,q,w,e;
		System.out.println("Enter 2 number");
		Scanner in= new Scanner(System.in);
		
		x=in.nextInt();
		y=in.nextInt();
		z=x+y;
	
		System.out.println(z);
		q=x-y;
		System.out.println(q);
		w=x*y;
		System.out.println(w);
		e=x/y;
		System.out.println(e);
		
		

	}

}
