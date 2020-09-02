package Number_Patten;

public class Number42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5; 
		
		for(int i=1; i<=n; i++){
			for(int j=2; j<=(2*i); j+=2){
				System.out.print(j);
			}
			
			for(int j=2*(i-1); j>=1; j-=2){
				System.out.print(j);
			}
			System.out.println();
			
		}
	}

}
