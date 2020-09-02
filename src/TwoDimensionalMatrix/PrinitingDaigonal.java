package TwoDimensionalMatrix;

public class PrinitingDaigonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 1, 2, 1, 8, 1 }, { 4, 5, 2, 6, 2 }, { 5, 6, 7, 8, 3 }, { 7, 8, 4, 4, 4 }, { 9, 10, 5, 3, 5 },
				{ 3, 4, 5, 6, 7 } };
		
//		int a[][]={{1,2},{1,3},{1,4},{1,5},{1,6}};

		int row = a.length;
		int col = a[0].length;

		for (int i = 0; i <= row + col - 1; i++) {
			for (int j = 0; j <= col - 1 && i - j >= 0; j++) {
				if (i - j <= row - 1) {
					System.out.print(a[i - j][j]+" ");
				}

			}
			System.out.println();
		}

	}

}
