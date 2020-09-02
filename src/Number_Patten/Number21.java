package Number_Patten;

public class Number21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		int temp=n;
		
	for(int i=1; i<=n; i++){
		for(int j=1; j<=n-i+1; j++){
			System.out.print(temp);
		}
		temp--;
		System.out.println();
	}
	
	System.out.println("********************");
	
	for(int i=n; i>=1; i--){
		for(int j=1; j<=i; j++){
			System.out.print(i);
		}
		System.out.println();
	}
	}

}
