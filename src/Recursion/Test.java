package Recursion;

import java.util.Scanner;

public class Test {
	
	static int B=1;
	static int H=3;
	static boolean flag=true;
	static{

		Scanner scan = new Scanner(System.in);
		B = scan.nextInt(); 
		scan.nextLine(); 
		H = scan.nextInt(); 
		scan.close();
		if(B>0 && H>0){ 
			flag = true;

		} else if(
				(B<=0 && H>=0)||(B>=0 && H<=0)){ 
			flag=false; 
			System.out.println("java.lang.Exception: Breadth and height must be positive"); 
			} else 
			{ flag=false; System.out.println("java.lang.Exception: Breadth and height must be positive"); }

		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}

}
