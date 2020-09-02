package Sorting;

import java.util.Random;

public class maximinnumberarr {

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
		
		
		for(int i=0; i<arr.length; i++){
		
			boolean flag=true;
			int max=arr[i];
			for(int j=i+1; j<arr.length; j++){
				if(max<arr[j]){
					flag=false;
					break;
				}
			}
			if(flag==true){
				System.out.println("Max element is "+ max);
				break;
			}
			
		}
		
	}

}
