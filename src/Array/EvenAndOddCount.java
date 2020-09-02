package Array;

import java.util.Random;
import java.util.Scanner;

public class EvenAndOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Random sc = new Random();
//		int[] arr = new int[6];
//
//		for (int i = 0; i < arr.length; i++) {
//
//			
//			arr[i]=sc.nextInt(1000);
//			System.out.println(arr[i]);
//		}
//		int evcount=0; 
//		int odcount1=0;
//		
//		for(int i=0; i<arr.length; i++){
//			if(arr[i]%2==0){
//				evcount++;
//			}else{
//				odcount1++;
//			}
//		}
//		System.out.println("Even Number count "+evcount);
//		System.out.println("Odd Number count "+ odcount1);
		
		
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[6];
		int evcount=0; 
		int odcount1=0;
		
		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}
		
		
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2==0){
				evcount++;
			}else{
				odcount1++;
			}
		}
		
		System.out.println("even count"+evcount);
		System.out.println("odd count"+odcount1);
	}

}
