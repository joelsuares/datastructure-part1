package Number_Patten;

public class Number5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				if(i==n/2+1 && j==n/2+1){
					System.out.print("0");
				}else{
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}

}
