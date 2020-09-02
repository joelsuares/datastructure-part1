package StarPatter;

public class Star16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		for(int i=n; i>=1; i--){
			for(int k=1; k<=n-i; k++){
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
