package ifelseexcercises;

import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a ;
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter a number");
		a=in.nextInt();
		
		if(a%2==0){
			System.out.println("The number is even");
		}else{
			System.out.println("The number is Odd");
		}
		
	}

}
