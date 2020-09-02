package Recursion;

import java.util.Random;

public class BubbleSorttech2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a Array length");

		Random sc = new Random();
		int n = sc.nextInt(15);
		System.out.println(n);
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt(1000000000);
		}
		System.out.println("Array before sorting");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		System.out.println("After sorting");
		
		for(int i=0; i<arr.length; i++){
			boolean flag=true;
			
			
			for(int j=0; j<arr.length-1-i; j++){
				if(arr[j]>arr[j+1]){
					flag=false;
					
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					
				}
				
			}
			if(flag==true){
				break;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		
	}

}
