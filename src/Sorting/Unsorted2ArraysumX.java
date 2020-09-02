package Sorting;

public class Unsorted2ArraysumX {

	public boolean exits(int arr[], int sum) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Unsorted2ArraysumX obj = new Unsorted2ArraysumX();

		int arr[] = new int[] { 2, 3, 4, 5, 6, 1, 8 };
		int sum = 10;
		boolean exits = obj.exits(arr, sum);
		System.out.println(exits);
	}

}
