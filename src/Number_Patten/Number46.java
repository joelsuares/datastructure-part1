package Number_Patten;

public class Number46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;

		for (int i = 1; i <= n; i++) {
			int temp = i;
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {
					System.out.print(temp);
					temp--;
				} else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}

}
