package Array;

import java.util.Random;
import java.util.Scanner;
public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r=new Random();
		int[] arr=new int[5];
		Scanner sc= new Scanner(System.in);
		
		for(int i=0; i<5; i++){
			arr[i]=r.nextInt(100);
		}
		System.out.println("values in the array");
		
		for(int i=0; i<5; i++){
			System.out.println(arr[i]);
		}

	}

}
