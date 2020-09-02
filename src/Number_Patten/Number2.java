package Number_Patten;

public class Number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5; 
		int x=1;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				System.out.print(x);
			}
			if(x==1){
				x=0;
			}else{
				x=1;
			}
			System.out.println();
		}
		
		System.out.println("******************");
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				System.out.print(i%2);
			}
			System.out.println();
		}
	}

}
