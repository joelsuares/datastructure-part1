package StarPatter;

public class Star15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		int m=9;
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=m; j++){
				if(i==1 || i==j || i+j==m+1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
