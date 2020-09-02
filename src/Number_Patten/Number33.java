package Number_Patten;

public class Number33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5; 
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n-i+1; j++){
				System.out.print(n+j-i);
			}
			System.out.println(); 
			
		}
	}

}
