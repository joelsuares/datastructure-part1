package StarPatter;

public class Star11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=9; 
		int m=5;
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=m; j++){
				if(i==1 || i==n || j==1 ||j==m || i==(n/2)+1){{
					if((i+j==2 || i+j==6 || i+j==10 || i+j==14)){
						System.out.print(" ");
						
					}else{
						System.out.print("*");
					}
				}
				}
			}
			System.out.println();
		}
	}

}
