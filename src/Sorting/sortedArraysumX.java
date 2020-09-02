package Sorting;

public class sortedArraysumX {

	public boolean exits(int arr[], int x) {

		int i = 0;
		int j = arr.length - 1;

		while (i < j) {
			if (arr[i] + arr[j] == x) {

				return true;
			} else if (arr[i] + arr[j] > x) {
				j--;
			} else {
				i++;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 11, 23, 45, 68 };

		int x = 77;
		sortedArraysumX obj = new sortedArraysumX();
		boolean exits = obj.exits(a, x);
		System.out.println(exits);

	}

}
