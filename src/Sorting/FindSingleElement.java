package Sorting;

public class FindSingleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[] { 2, 3, 8, 2, 3, };

		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result = result ^ a[i];
		}

		System.out.println(result);
	}

}
