package Sorting;

public class Partitiontech {

	public int partiotion(int arr[], int start, int end) {
		int p = arr[start];
		int i = start;
		int j = end;

		while (i < j) {
			while (i<=j && arr[i] <=p) {
				i++;
			}
			while (j>=i && arr[j] >p) {
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
		Partitiontech obj = new Partitiontech();
		int partiotion = obj.partiotion(arr, 0, arr.length - 1);
		System.out.println(partiotion);

		for (int r : arr) {
			System.out.print(r + " ");
		}

	}

}
