package Recursion;

public class Binary1 {

	public void binary(int arr[], int index) {

		if (arr.length == index) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
			return;
		}

		arr[index] = 0;
		binary(arr, index + 1);
		arr[index] = 1;
		binary(arr, index + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Binary1 obj = new Binary1();
		obj.binary(new int[3], 0);

	}

}
