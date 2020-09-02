package StarPatter;

public class Star10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		int m=19;
		
		for(int i=1; i<=n; i++ ){
			for(int k=1; k<=n-i; k++){
				System.out.print(" ");
			}
			for(int j=i; j<=2*i-1; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
