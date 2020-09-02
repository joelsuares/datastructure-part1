package Array;

import java.util.Random;
import java.util.Scanner;

public class CopyArrayOneToOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int src[]=new int[5];
		// int dec[]=new int [5];
		// Random sc=new Random();
		//
		// for(int i=0; i<src.length; i++){
		//
		// src[i]=sc.nextInt(1000);
		// System.out.println(src[i]);
		// }
		//
		// for(int i=0; i<src.length; i++){
		// dec[i]=src[i];
		// }
		//
		// for(int i=0; i<src.length; i++){
		// System.out.println("actual array "+src[i]);
		// System.out.println("Des array "+dec[i]);
		// }

		int src[] = new int[5];
		int dec[] = new int[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			src[i] = sc.nextInt();
		}

		for (int i = 0; i < 5; i++) {
			dec[i] = src[i];
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("destination element r" + dec[i]);
		}
	}

}
