package Number_Patten;

public class Number39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5; 
		int m=9; 
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=(i*2-1); j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
