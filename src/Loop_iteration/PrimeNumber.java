package Loop_iteration;

import java.util.Scanner; 
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter a Number");
		
		n=sc.nextInt();
		boolean flag=true; 
		
		for(int i=2; i<=n/2; i++){
			if(n%i==0){
				flag= false;
				if(flag==false){
					System.out.println("N divisible number are " +i);
				}
				
			}
			
		}
		if(flag==true){
			System.out.println("Number is prime");
		}else{
			System.out.println("Number is not prime");
		}
	}

}
