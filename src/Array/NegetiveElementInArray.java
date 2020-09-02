package Array;

import java.util.Scanner;
public class NegetiveElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		
		for(int i=0; i<arr.length; i++){
			System.out.println("Enter a number");
			arr[i]=sc.nextInt();
//			System.out.println(arr[i]);
		}
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]<0){
				System.out.println("Negetive NUmber are in array "+arr[i]);
			}
		}
		
	}

}
