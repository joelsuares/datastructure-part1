package Recursion;

public class StepCount {

	public int count(int n) {
		if (n < 0) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}

		return count(n - 1) + count(n - 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StepCount obj = new StepCount();
		int count = obj.count(4);
		System.out.println(count);
	}

}
