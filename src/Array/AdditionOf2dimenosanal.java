package Array;

import java.util.Scanner;

public class AdditionOf2dimenosanal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int row=3,col=3;
		int[][] a = new int[3][3];
		int[][] b = new int[row][col];
		int[][] c=  new int[3][3];

		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.println("Enter a i th Location");
				a[3][3]=sc.nextInt();
			}
		}
		
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				System.out.println("Enter a i th Location");
				b[row][col]=sc.nextInt();
			}
		}
		
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				
				c[row][col]=a[row][col]+b[row][col];
				System.out.println("a+b = "+c[row][col]);
			}
		}
		
	}

}
