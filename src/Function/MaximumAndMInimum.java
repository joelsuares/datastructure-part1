package Function;

import java.util.Scanner;
public class MaximumAndMInimum {

	public void maxmin(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a>b){
			System.out.println("Max number is "+a);
			System.out.println("Min number is "+b);
		}else{
			System.out.println("Max number is "+b);
			System.out.println("Min number is "+a);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Maximum and minimum ");
		MaximumAndMInimum obj=new MaximumAndMInimum();
		obj.maxmin();
	}

}
