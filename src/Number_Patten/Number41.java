package Number_Patten;

public class Number41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5; 
		
		
		for(int i=1; i<=n; i++){
		
			for(int j=1; j<=(i*2)-1; j+=2){
				System.out.print(j);
			}
			for(int j=((i-1)*2)-1; j>=1; j-=2){
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
