package Array;

import java.util.Random;
import java.util.Scanner;

public class SumOfRandomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Random r=new Random();
		// int[] arr=new int[5];
		// Scanner sc= new Scanner(System.in);
		//
		// for(int i=0; i<5; i++){
		// arr[i]=r.nextInt(1000);
		// }
		// int sum=0;
		//
		// for(int i=0 ; i<arr.length; i++){
		// System.out.println(arr[i]);
		// sum= sum+arr[i];
		// }
		// System.out.println("Sum of all the number in array="+sum);

		Random sc = new Random();
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt(1000);
			System.out.println("array in location i " + arr[i]);
		}

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("The sum of total array " + sum);
	}

}
