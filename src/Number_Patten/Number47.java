package Number_Patten;

public class Number47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5; 
		int x=1;
		int count=1;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=x; j++){
				if(count==10){
					count=1;
				}else{
				System.out.print(count);
				}
				count++;
				x=x*2;
			}
			System.out.println();
		}
	}

}
