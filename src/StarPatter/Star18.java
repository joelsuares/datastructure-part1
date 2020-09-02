package StarPatter;

public class Star18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		for (int i = 1; i <= n-1; i++) {
			System.out.print(" ");
			for (int j = 1; j <= n-1; j++) {
				if (i == 1 || j == n-1 || i <= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
