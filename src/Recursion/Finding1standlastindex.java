
package Recursion;

public class Finding1standlastindex {

	public int Firstindexsearch(int arr[], int key) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (arr[mid] == key && arr[mid - 1] < key) {
				return mid;
			}

			if (arr[mid] > key) {
				end = mid - 1;
			}
			if (arr[mid] < key) {
				start = mid + 1;
			}

		}
		return 0;

	}

	public int Lastindexsearch(int arr[], int key) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (arr[mid] == key && arr[mid + 1] > key) {
				return mid;
			}

			if (arr[mid] > key) {
				end = mid - 1;
			}
			if (arr[mid] < key) {
				start = mid + 1;
			}

		}
		return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[] { 2, 2, 3, 3, 4, 4, 4, 4, 5, 5, 7, 7 };
		int key = 4;

		Finding1standlastindex obj = new Finding1standlastindex();
		int indexsearch = obj.Firstindexsearch(a, key);
		System.out.println(indexsearch);

		int lastindexsearch = obj.Lastindexsearch(a, key);
		System.out.println(lastindexsearch);

	}

}
