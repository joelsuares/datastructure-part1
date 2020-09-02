package ifelseexcercises;

import java.util.Scanner;

public class Maximumbetween3number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c, max;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a");
		a = in.nextInt();
		System.out.println("Enter b");
		b = in.nextInt();
		System.out.println("Enter c");
		c = in.nextInt();

		 if(a > b)
		    {
		        if(a > c)
		        {
		          
		            max = a;
		        }
		        else
		        {
		            
		            max = c;
		        }
		    }
		    else
		    {
		        if(b > c)
		        {
		            
		            max = b;
		        }
		        else
		        {
		            
		            max = c;
		        }
		    }
		    
		    System.out.println("the grater num is "+max);
		

	}

}
