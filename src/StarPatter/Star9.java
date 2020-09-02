package StarPatter;

public class Star9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=7;
		int m=13;
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=m; j++){
				if(i==n || (i+j==n+1) || (j-i==n-1)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
