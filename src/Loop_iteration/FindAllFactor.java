package Loop_iteration;

import java.util.Scanner;
public class FindAllFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n; 
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter a Number");
		n=sc.nextInt();
		
		for(int i=1; i<=n; i++){
			if(n%i==0){
				System.out.println("The factors are"+i);
			}
		}
	}

}
