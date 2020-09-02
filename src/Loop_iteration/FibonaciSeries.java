package Loop_iteration;

import java.util.Scanner;
public class FibonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		
		int t1=0; 
		int t2=1;
		int t3=0;
		
		for(int i=3; i<=n; i++){
			t3=t2+t1; 
			t1=t2;
			t2=t3;
		}
		System.out.println(t3);
	}

}
