package RecurrisonRepeat;

public class BinaryPrintIndex {

	public void binary(int[] a, int index) {

		if (a.length == index) {
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]);
			}
			System.out.println();
			return;

		}

		a[index] = 0;
		binary(a, index + 1);
		a[index] = 1;
		binary(a, index + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryPrintIndex obj=new BinaryPrintIndex();
		int a[]=new int[3];
		obj.binary(a, 0);
	}

}
