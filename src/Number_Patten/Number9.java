package Number_Patten;

public class Number9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n) {
			
					if ((i == 1 && j == 1) || (i == 1 && j == n) || (i == n && j == 1) || (i == n && j == n)) {
						System.out.print("0");
					} else {
						System.out.print("1");
					}

				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}

}
