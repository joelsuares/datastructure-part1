package TwoDimensionalMatrix;

public class RobotProblem0sand1s {

	public boolean robot(int a[][], int row, int col, int index, int path[]) {

		if (col == a[0].length - 1) {
			path[index] = a[row][col];
			int i=row+1;
			int end=a.length-1;
			
			while(a[row][col]==1){
				i++;
				if(a[row][col]==a[a.length-1][a[0].length-1]){
					return true;
				}
			}
			
		} else if (row == a.length - 1) {

		} else {
			path[index] = a[row][col];

			if (a[row][col] == 1) {
				return robot(a, row, col + 1, index + 1, path);
				return robot(a, row + 1, col, index + 1, path);
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 1, 1, 1, 0 }, { 1, 1, 0, 1 }, { 1, 1, 1, 1 }, { 1, 0, 1, 0 }, { 1, 1, 1, 1 } };

		int path[] = new int[30];

		RobotProblem0sand1s obj = new RobotProblem0sand1s();
		obj.robot(a, 0, 0, 0, path);
	}

}
