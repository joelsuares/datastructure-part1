package Number_Patten;

public class Number38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				if(i==n || j==1 || i==j){
					System.out.print("1");
				}else{
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}

}
