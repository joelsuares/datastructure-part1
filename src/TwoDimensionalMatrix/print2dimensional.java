package TwoDimensionalMatrix;

import java.util.*;


public class print2dimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Random ob= new Random();

		System.out.println("Enter row and col");
		int n = sc.nextInt();
		int a[][]={{1,2,3},{2,4,5},{4,4,5}}; 

//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				a[i][j] = sc.nextInt();
//			}
//		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				System.out.println(a[i][j]);
			}
		}
	}

}
