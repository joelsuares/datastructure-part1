package RecurrisonRepeat;

public class Ncr {

	public int ncr(int n,int r){
		
		if(n==r){
			return 1;
		}
		if(r==0){
			return 1;
		}
		
		int n1=ncr(n-1, r-1);
		int n2=ncr(n-1,r);
		return n1+n2;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ncr obj=new Ncr();
		int ncr = obj.ncr(5, 3);
		System.out.println(ncr);
	}

}
