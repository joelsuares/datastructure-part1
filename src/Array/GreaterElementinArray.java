package Array;

import java.util.Random;
import java.util.Scanner;

public class GreaterElementinArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Random r = new Random();
		// int[] arr = new int[5];
		// Scanner sc = new Scanner(System.in);
		//
		// for (int i = 0; i < arr.length; i++) {
		// arr[i] = r.nextInt(1000);
		// }
		// for (int i = 0; i < arr.length; i++) {
		// System.out.println(arr[i]);
		// }
		//
		// boolean flag=true;
		// int temp;
		//
		// for(int j=0; j<arr.length; j++){
		// temp=arr[j];
		// flag=true;
		// for(int i=0; i<arr.length; i++){
		// if(arr[i]>temp){
		// flag=false;
		// break;
		// }
		// }
		// if(flag==true){
		// System.out.println("The greatest element "+temp);
		// }
		// }

		Random sc = new Random();
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the location i" + i);
			arr[i] = sc.nextInt(1000);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}

		int temp ;
		boolean flag = true;
		for (int j = 0; j < arr.length; j++) {
			temp = arr[j];
			flag = true;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > temp) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println("Greater Number is " + temp);
			}

		}
		// boolean flag=true;
				// int temp;
				//
				// for(int j=0; j<arr.length; j++){
				// temp=arr[j];
				// flag=true;
				// for(int i=0; i<arr.length; i++){
				// if(arr[i]>temp){
				// flag=false;
				// break;
				// }
				// }
				// if(flag==true){
				// System.out.println("The greatest element "+temp);
				// }
				// }
		
		
		
		System.out.println("-----------other logic--------------");
		
		int max=arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println("Maximum Number is "+max);
		

	}
}