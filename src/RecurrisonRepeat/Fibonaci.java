package RecurrisonRepeat;

public class Fibonaci {

	public int fib(int n){
		if(n>0){
			
			if(n==1){
				return 1;
			}
			if(n==2){
				return 1;
			}
			return fib(n-1)+fib(n-2);
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fibonaci obj=new Fibonaci();
		int fib = obj.fib(7);
		System.out.println(fib);
	}

}
