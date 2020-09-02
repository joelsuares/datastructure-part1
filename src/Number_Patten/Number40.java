package Number_Patten;

public class Number40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5; 
		
		for(int i=1; i<=n; i++){
			int k=1; 
			int x=2;
			for(int j=1; j<=i; j++){
				
				if(i%2==0){
					System.out.print(x);
					x=x+2;
				}else{
					System.out.print(k);
					k=k+2;
				}
			}
			System.out.println();
		}
	}

}
