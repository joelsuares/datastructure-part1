package Number_Patten;

public class Number34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5; 
		for(int i=1; i<=n; i++){
			int k=(i*2)-1;
			for(int j=1; j<=n-i+1; j++, k=k+2){
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
