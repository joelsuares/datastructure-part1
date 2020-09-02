package RecurrisonRepeat;

public class Recur1 {

	public void fun(int n){
		if(n>0){
			System.out.println(n);
			n=n-1;
			fun(n);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Recur1 obj=new Recur1();
		obj.fun(4);
	}

}
