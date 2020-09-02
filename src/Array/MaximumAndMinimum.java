package Array;

import java.util.Random;
public class MaximumAndMinimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random sc=new Random();
		int[] arr=new int[5];
		
		for(int i=0; i<arr.length; i++){
			
			arr[i]=sc.nextInt(1000);
			System.out.println(arr[i]);
		}
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max){
				max=arr[i];
			}
			
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("Maximum NUmber "+max);
		System.out.println("Minimum Number "+min);
		
	}

}
