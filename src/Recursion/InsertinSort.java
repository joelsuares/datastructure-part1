package Recursion;

import java.util.Random;
public class InsertinSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random sc=new Random();
		
		System.out.println("Enter a length array");
		int n=sc.nextInt(15);
		System.out.println(n);
		
		int arr[]=new int[n];
		
		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt(1000);
		}
		System.out.println("Before sorting");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
		
		for(int i=1; i<arr.length; i++){
			int j=i-1;
			int key=arr[i];
			
			while(j>=0 && arr[j]>key){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;

			
		}
		
		System.out.println();
		System.out.println("Array after sorting");
		
		for(int k=0; k<arr.length; k++){
			System.out.print(arr[k]+" ");
		}
		
	}

}
