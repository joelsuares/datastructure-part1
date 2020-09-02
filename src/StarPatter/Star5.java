package StarPatter;

public class Star5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int i,j;
		for( i=1; i<=n; i++){
			for( j=1; j<=n-i; j++){
				System.out.print(" ");
			}
			for( j=1; j<=n; j++){
				if(i==1 || i==n || j==1 || j==n){
				System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}

}
