package Sorting;

public class BinarySearchon2sortedArray {

	public int binarySearch(int arr[], int key) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == key) {
				return key;
			} else if (arr[mid] > key) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[] { 1, 2, 3, 4, 7, 8, 9 };
		int b[] = new int[] { 2, 3, 6, 8, 9, 11, 34 };

		BinarySearchon2sortedArray obj = new BinarySearchon2sortedArray();

		for (int i = 0; i < b.length; i++) {
			int binarySearch = obj.binarySearch(a, b[i]);
			System.out.println(binarySearch);
		}
	}

}
