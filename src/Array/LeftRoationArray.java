package Array;

public class LeftRoationArray {

	public void leftroate(int arr[], int d, int n) {

		for (int i = 1; i <= d; i++) {
			leftrotateByone(arr, n);
		}
	}

	public void leftrotateByone(int arr[], int n) {

		int temp = arr[0];
		
		int i;

		for (i = 0; i < arr.length - 1; i++) {

			arr[i] = arr[i + 1];

		}
		arr[i] = temp;

	}

	public void print(int arr[]) {

		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] { 4, 5, 8, 1, 8, 3, 9, 6, 2 };

		for (int a : arr) {
			System.out.print(a + " ");
		}

		LeftRoationArray obj = new LeftRoationArray();
		obj.leftroate(arr, 2, arr.length);
		System.out.println();
		obj.print(arr);

	}

}
