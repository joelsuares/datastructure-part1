package Number_Patten;

public class Number10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("***************************************************");
		int count =1;
		
		for(int i=1; i<=n; i++,	System.out.println()){
			
			for(int j=1; j<=n; j++){
				System.out.print(count);
			}
			count++;
		
		}
		
		
	}

}
