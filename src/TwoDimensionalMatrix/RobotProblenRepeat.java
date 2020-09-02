package TwoDimensionalMatrix;

public class RobotProblenRepeat {

	public void robot(int arr[][], int row, int col, int index, int path[]) {
		if (col == arr[0].length - 1) {

			path[index] = arr[row][col];
			for (int i = 0; i <= index; i++) {

				System.out.print(path[i] + " ");
			}
			for (int i = row + 1; i <= arr.length - 1; i++) {
				System.out.print(arr[i][col] + " ");
			}
			System.out.println();
		} else if (row == arr.length - 1) {
			path[index] = arr[row][col];
			for (int i = 0; i <= index; i++) {
				System.out.print(path[i] + " ");
			}
			for (int i = col + 1; i <= arr[0].length - 1; i++) {
				System.out.print(arr[row][i] + " ");
			}
			System.out.println();

		} else {
			path[index] = arr[row][col];
			robot(arr, row, col + 1, index + 1, path);
			robot(arr, row + 1, col, index + 1, path);

			return;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] path = new int[30];

		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		RobotProblenRepeat obj = new RobotProblenRepeat();
		obj.robot(a, 0, 0, 0, path);

	}

}
