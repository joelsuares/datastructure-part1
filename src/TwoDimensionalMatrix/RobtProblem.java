package TwoDimensionalMatrix;

public class RobtProblem {

	public void robot(int a[][], int row, int col, int index, int path[]) {

		if (col == a[0].length - 1) {
			path[index] = a[row][col];

			for (int i = 0; i <= index; i++) {
				System.out.print(path[i] + " ");
			}
			for (int i = row + 1; i <= a.length - 1; i++) {
				System.out.print(a[i][col] + " ");
			}
			System.out.println();
			return;
		} else if (row == a.length - 1) {
			path[index] = a[row][col];

			for (int i = 0; i <= index; i++) {
				System.out.print(path[i] + " ");
			}
			for (int i = col + 1; i <= a[0].length - 1; i++) {
				System.out.print(a[row][i] + " ");
			}
			System.out.println();
			return;
		} else {
			
			path[index] = a[row][col];
			robot(a, row, col + 1, index + 1, path);
			robot(a, row + 1, col, index + 1, path);
			return;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int path[] = new int[30];
		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		RobtProblem obj = new RobtProblem();
		obj.robot(a, 0, 0, 0, path);
	}

}
