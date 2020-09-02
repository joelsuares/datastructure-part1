package Array;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] arr = new int[5];
//
//		Scanner sc = new Scanner(System.in);
//
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Enter the value ith location " + i);
//			arr[i] = sc.nextInt();
//
//		}
//		System.out.println("***********************************");
//
//		for (int i = 0; i <= 4; i++) {
//			System.out.println(arr[i]);
//		}
		
//		int[] arr=new int[5];
//		Scanner sc=new Scanner(System.in);
//		
//		for(int i=0; i<arr.length; i++){
//			System.out.println("Enter the value of Location"+i);
//			arr[i]=sc.nextInt();
//		}
//		
//		for(int i=0; i<arr.length; i++){
//			System.out.println(arr[i]);
//		}
		
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<5; i++){
			System.out.println("Enter the element "+i+"location");
			System.out.println();
			arr[i] = sc.nextInt();
			
		}
		
		for(int i=0; i<5; i++){
			System.out.println(arr[i]);
		}
	
	}

}
