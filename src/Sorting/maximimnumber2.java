package Sorting;

import java.util.Random;

public class maximimnumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a Array length");

		Random sc = new Random();
		int n = sc.nextInt(15);
		System.out.println(n);
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt(10000);
		}
		

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		
		int j=Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++){
			if(j<arr[i]){
				j=arr[i];
			}
		}
		System.out.println("Max element is "+j);
	}

}
