package Sorting;

public class TwosortedArraytoone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[] { 2, 3, 4, 5, 6 };
		int b[] = new int[] { 7, 8, 9, 10, 11 };

		int c[] = new int[a.length + b.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < a.length && j < b.length) {

			if (a[i] < b[j]) {
				c[k] = a[i];
				i++;
			} else {
				c[k] = b[j];
				j++;
			}
			k++;

		}

		if (i < a.length) {
			for (; i < a.length; i++) {
				c[k] = a[i];
				k++;
			}
		}

		if (j < b.length) {
			for (; j < b.length; j++) {
				c[k] = b[j];
				k++;
			}
		}

		for (int l = 0; l < c.length; l++) {
			System.out.print(c[l] + " ");
		}
	}

}
