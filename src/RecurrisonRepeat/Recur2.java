package RecurrisonRepeat;

public class Recur2 {

	public void fun(int n) {
		if (n > 0) {
			System.out.println(n);
			n = n - 1;
			fun(n);
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Recur2 obj = new Recur2();
		obj.fun(4);
	}

}
