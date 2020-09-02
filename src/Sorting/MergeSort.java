package Sorting;

public class MergeSort {

	public void Merge(int arr[], int start, int mid, int end) {

		int temp[] = new int[end - start + 1];

		int i = start;
		int j = mid;
		int k = 0;

		while (i < mid && j <= end) {
			if (arr[i] < arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}

			if (i < mid) {
				for (; i < mid;) {
					temp[k++] = arr[i++];
				}
			}
			if (j <= end) {
				for (; j <= end;) {
					temp[k++] = arr[j++];
				}
			}

		}
		j = start;

		for (int s = 0; s < temp.length; s++) {
			arr[j++] = temp[s];
		}
	}

	void function(int arr[], int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			function(arr, start, mid);
			function(arr, mid + 1, end);
			Merge(arr, start, mid + 1, end);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MergeSort obj=new MergeSort();
		int[] arr = new int[] { 6, 4, 7, 3, 5, 4, 15, 9, 17,12 };
		obj.function(arr, 0, arr.length-1);
		
		for(int i:arr){
			System.out.print(i+" ");
		}
		
		
		

	}

}
