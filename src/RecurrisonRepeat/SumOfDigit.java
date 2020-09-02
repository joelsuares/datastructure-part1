package RecurrisonRepeat;

public class SumOfDigit {
	
	public int sumdigit(int n){
		if(n>0){
		
		return (n%10)+sumdigit(n/10);
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumOfDigit obj=new SumOfDigit();
		int sumdigit = obj.sumdigit(4321);
		System.out.println(sumdigit);
	}

}
