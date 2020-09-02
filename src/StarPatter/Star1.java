package StarPatter;

public class Star1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("1234567890");
		for(int i=n; i>=1; i--){
			for(int j=n; j>=1; j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
