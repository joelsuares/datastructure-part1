package RecurrisonRepeat;

public class CoinChange {

	public void change(int arr[], int index, int[] coin, int n) {

		if(n==0){
			for(int i=0; i<index; i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			return;
		}
		
		if (n < 0) {
			return;
		}

		for (int i = 0; i < coin.length; i++) {
			arr[index] = coin[i];
			change(arr, index + 1, coin, n - coin[i]);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int coin[] = { 5, 10, 20, 50 };
		int n = 50;
		int arr[]=new int[100];
		
		CoinChange obj=new CoinChange();
		obj.change(arr, 0, coin, n);

	}

}
