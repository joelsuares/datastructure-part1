package Number_Patten;

public class Number16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5; 
		
		for(int i=1; i<=n; i++){
			for(int j=i; j<=n; j++){
				System.out.print(j);
			}
			for(int j=i; j>1; j--){
				System.out.print(j-1);
			}
			System.out.println();
		}
	}

}
