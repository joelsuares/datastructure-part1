package RecurrisonRepeat;

public class DecimalToBinary {
	
	public void decitoBin(int n){
		
		if(n==0){
			return ;
		}
		
		decitoBin(n/2);
		System.out.print(n%2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalToBinary obj=new DecimalToBinary();
		obj.decitoBin(13);

	}

}
