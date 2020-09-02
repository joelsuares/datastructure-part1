package RecurrisonRepeat;

public class Multiplication {

	public int mul(int n, int m) {

		if (n == 0 || m==0) {
			return 0;
		}

		if (n < m) {
			mul(m, n);
		}
		
		return n+mul(n, m-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multiplication obj=new Multiplication();
		int mul = obj.mul(7, 4);
		System.out.println(mul);
	}

}
