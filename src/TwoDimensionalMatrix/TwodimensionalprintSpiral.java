package TwoDimensionalMatrix;

public class TwodimensionalprintSpiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int a[][] = { { 3, 5, 7, 12, 15, 12 }, { 6, 9, 14, 16, 19, 13 }, { 7,
		 * 12, 18, 21, 24, 15 }, { 10, 13, 22, 27, 31, 45 }, { 11, 17, 23, 29,
		 * 34, 98 }, { 33, 44, 55, 66, 88, 45}, { 34, 24, 56, 23, 75, 24 } };
		 */

		// int a[][]={{1,2},{3,4}};
		//int a[][] = { { 1, 2, 1 }, { 3, 4, 2 }, { 5, 6, 4 }, { 7, 8, 8 }, { 7, 8, 8 } };
		int a[][] = { { 1, 2, 1,8 }, { 4,5,2,6 }, { 5,6,7,8 }, { 7, 8, 4,4 }, { 9,10,5,3 } };

		int m = 0;
		int n = 4;
		int l = 0;
		int k = 2;

		while (m <= n && l <= k) {

			for (int i = l; i <= k; i++) {
				System.out.print(a[m][i] + " ");

			}
			m++;

			for (int i = m; i <= n; i++) {
				System.out.print(a[i][k] + " ");
			}

			k--;

			if (m < n)
				for (int i = k; i >= l; i--) {
					System.out.print(a[n][i] + " ");
				}

			n--;

			if (l < k)
				for (int i = n; i >= m; i--) {
					System.out.print(a[i][l] + " ");

				}
			l++;
		}

	}

}
