package SortingReapeat;

public class SelectionSort {

	public int maxindex(int[] arr, int lengt) {

		int max = arr[0];
		int index = 0;

		for (int i = 1; i <=lengt; i++) {
			if (arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 7, 3, 6, 1, 9, 17, 11, 8 };
		SelectionSort obj = new SelectionSort();

		for (int i = arr.length - 1; i >= 0; i--) {
			
			int maxindex = obj.maxindex(arr, i);
			
			int temp=arr[maxindex];
			arr[maxindex]=arr[i];
			arr[i]=temp;

		}
		
		for(int sort:arr){
			System.out.print(sort+" ");
		}

	}

}
