package Array;

import java.util.Scanner;
public class NegetiveElememntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		
		for(int i=0; i<arr.length; i++){
			
			System.out.println("Enter the NUmber");
			arr[i]=sc.nextInt();
		}
		
		int count=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]<0){
				count++;
			}
		}
		System.out.println("Total number of negetive NUmber "+count);
	}

}
