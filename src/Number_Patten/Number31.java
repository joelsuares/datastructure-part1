package Number_Patten;

public class Number31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5; 
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n-i+1; j++){
				System.out.print(j-1+i);
			}
			System.out.println();
		}
	}

}