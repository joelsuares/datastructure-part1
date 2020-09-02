package RecurrisonRepeat;

public class ReverseNumber {
	
	public int reversenum(int n, int res){
	
		if(n>0){
			
			res=res*10+n%10;
			int m=reversenum(n/10, res);
			return m;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseNumber obj=new ReverseNumber();
		int reversenum = obj.reversenum(1234,0);
		System.out.println(reversenum);
	}

}
