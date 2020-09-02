package ifelseexcercises;

import java.util.Scanner;
public class Divisibleby5or11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter a number");
		a=in.nextInt();
		
		if((a%5== 0) && (a%11 ==0)){
			System.out.println("The number is divisible by 5 and 11");
		}else{
			System.out.println("The number is not divisible by 5 and 11");
		}
		
		
	}

}
