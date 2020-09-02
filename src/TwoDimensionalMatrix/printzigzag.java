package TwoDimensionalMatrix;

public class printzigzag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 3, 5, 7, 12, 15 }, { 6, 9, 14, 16, 19 }, { 7, 12, 18, 21, 24 }, { 10, 13, 22, 27, 31 },
				{ 11, 17, 23, 29, 34 } };

		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {

				for (int j = 0; j < a.length; j++) {
					System.out.println(a[i][j]);
				}
			} else {
				for (int j = a.length - 1; j >= 0; j--) {
					System.out.println(a[i][j]);

				}
				
			}

		}

	}
}
