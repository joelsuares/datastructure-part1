package Recursion;

public class Coinchange {

	public void change(int arr[], int coin[], int index, int n) {

		if (n == 0) {
			for (int i = 0; i < index; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}

		if (n < 0) {
			return;
		}

		for (int i = 0; i < coin.length; i++) {
			arr[index] = coin[i];
			change(arr, coin, index + 1, n - coin[i]);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coin[] = { 5, 10, 15, 20 };
		int n = 25;

		Coinchange obj = new Coinchange();
		obj.change(new int[15], coin, 0, n);

	}

}
