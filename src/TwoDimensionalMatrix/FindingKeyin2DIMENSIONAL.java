package TwoDimensionalMatrix;

public class FindingKeyin2DIMENSIONAL {

	public boolean exits(int arr[][], int key) {
		int i = 0;
		int j = arr.length - 1;

		while (i < arr.length && j >= 0) {
			if (arr[i][j] == key) {
				return true;

			} else if (arr[i][j] < key) {
				i++;
			} else {
				j--;
			}

		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 3, 5, 7, 12, 15 }, { 6, 9, 14, 16, 19 }, { 7, 12, 18, 21, 24 }, { 10, 13, 22, 27, 31 },
				{ 11, 17, 23, 29, 34 } };
		
		int key=10;

		FindingKeyin2DIMENSIONAL obj=new FindingKeyin2DIMENSIONAL();
		boolean exits = obj.exits(a, key);
		System.out.println(exits);
	}

}
