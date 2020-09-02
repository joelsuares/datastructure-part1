package Sorting;

public class Partiotion1 {

	public int partiondin(int arr[], int start, int end) {

		int p = arr[start];
		int i = start;
		int j = end;

		while (i < j) {
			while (i <= j && arr[i] <= p) {
				i++;
			}
			while (j >= i && arr[j]> p) {
				j--;
			}

			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}

		}
		return j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] { 6, 4, 7, 3, 5, 4, 15, 9, 17,12 };
		Partiotion1 obj = new Partiotion1();
		int partiondin = obj.partiondin(arr, 0, arr.length - 1);
		System.out.println(partiondin);

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
