package Recursion;

import java.util.Scanner;


public class Binary {

	public void binaryprint(int arr[], int index) {
		if (arr.length == index) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
			return;
		}

		arr[index] = 0;
		binaryprint(arr, index + 1);
		arr[index] = 1;
		
		binaryprint(arr, index + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Binary obj = new Binary();
		obj.binaryprint(new int[3], 0);

		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		
	}

}
