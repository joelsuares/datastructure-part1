package SortingReapeat;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2, 63, 2, 3, 53, 11, 34, 22, 88, 47, 23 };
		int arr1[] = { 4, 2, 22, 41, 13, 63, 21, 14, 76, 13, 12 };
		int arr2[] = { 67, 2, 4, 42, 46, 27, 21, 77, 23, 15 };

		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i <= arr.length - 2; i++) {

				if (arr[i] > arr[i + 1]) {
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}
			}
		}

		for (int sort : arr) {
			System.out.print(sort + " ");
		}
		System.out.println();
		System.out.println("**************************");

		for (int j = 0; j < arr1.length; j++) {
			for (int i = 0; i <= arr1.length - 2 - j; i++) {

				if (arr1[i] > arr1[i + 1]) {
					int temp = arr1[i + 1];
					arr1[i + 1] = arr1[i];
					arr1[i] = temp;
				}
			}
		}
		for (int sort : arr1) {
			System.out.print(sort + " ");
		}

		System.out.println();
		System.out.println("**************************");

		for (int j = 0; j < arr2.length; j++) {

			for (int i = 0; i <= arr2.length - 2 - j; i++) {

				if (arr2[i] > arr2[i + 1]) {

					int temp = arr2[i + 1];
					arr2[i + 1] = arr2[i];
					arr2[i] = temp;
				}
			}

		}

		for (int sort : arr2) {
			System.out.print(sort + " ");
		}

	}

}
