package Sorting;

public class CommonElement3Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a1 = new int[] { 2, 3, 4 };
		int[] a2 = new int[] { 2, 3, 4, 5, 6 };
		int[] a3 = new int[] { 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < a1.length; i++) {
			boolean flag = false;
			for (int j = 0; j < a2.length; j++) {
				if (a1[i] == a2[j]) {
					flag = true;
					break;
				}
			}

			if (flag == true) {
				for (int k = 0; k < a3.length; k++) {

					if (a1[i] == a3[k]) {
						System.out.print(a1[i] + " ");
					}
				}
			}
		}
	}

}
