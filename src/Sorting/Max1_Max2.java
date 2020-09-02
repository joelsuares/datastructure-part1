package Sorting;

import java.util.Random;

public class Max1_Max2 {

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

		int max1 = arr[0];
		int index = 0;
		for (int j = 0; j < arr.length; j++) {
			if (max1 < arr[j]) {
				max1 = arr[j];
				index = j;
			}
		}
		
		System.out.println(max1);
		
		int temp=arr[index];
		arr[index]=arr[arr.length-1];
		arr[arr.length-1]=temp;

		int max2=arr[0];
		for(int i=0; i<arr.length-1; i++){
			if(max2<arr[i] && max1!=max2){
				max2=arr[i];
			}
		}
		System.out.println(max2);
	}

}
