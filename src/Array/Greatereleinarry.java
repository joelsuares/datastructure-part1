package Array;

import java.util.Scanner;

public class Greatereleinarry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		
		for(int i=0; i<arr.length; i++){
			int temp=arr[i];
			boolean flag=true;
			
			for(int j=0; j<arr.length; j++){
				if(arr[j]>temp){
					flag=false;
					break;
				}
			}
			if(flag==true){
				System.out.println("The gretaest element is "+temp);
				break;
			}
		}
	}

}
