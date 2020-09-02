package ifelseexcercises;

import java.util.Scanner;
public class Checkwtherposornegorzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,res;
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter a number");
		a=in.nextInt();
		
		if(a>=0){
			if(a==0){
				System.out.println("Ur number is zero");
			}else{
				System.out.println("Num is positive");
			}
		}else{
			System.out.println("Num is negetive");
		}
	}

}
