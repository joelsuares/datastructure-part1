package Number_Patten;

public class Number37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
	 
		int k=1;
		
		for(int i=1; i<=n; i++){
		
			for(int j=1; j<=i; j++){
				if(k%2==1){
					System.out.print(1);
				
				}else{
					System.out.print(0);
			
				}
				k++;
			}
			System.out.println();
		}
	}

}
