package Recursion;

import java.util.Scanner;
import java.util.Random;

public class Getmaxindex {

	public int getmaxIndex(int arr[], int length) {
		int max = arr[0];
		int index = 0;
		for (int i = 1; i <= length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("SEARCHING SORT");
		Random sc = new Random();
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter a Array length");

		int n = sc1.nextInt();
		Getmaxindex obj = new Getmaxindex();
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt(1000);
		}
		System.out.println("Before Sorting");
 
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
		
		for (int i = arr.length - 1; i >= 0; i--) {

			int index = obj.getmaxIndex(arr, i);

			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}

		System.out.println();
		System.out.println("After sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
