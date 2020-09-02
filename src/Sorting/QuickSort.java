package Sorting;

public class QuickSort {
	public int partionswap(int arr[],int start, int end){
		int pirot=arr[start];
		int i=start;
		int j=end;
		
		while(i<j){
			while(i<=j && arr[i]<=pirot){
				i++;
			}
			while(j>=i && arr[j]>pirot){
				j--;
			}
			if(i<j){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		arr[start]=arr[j];
		arr[j]=pirot;
		return j;
	}
	
	public void quick(int arr[],int start,int end){
		
		if(start<end){
			int p = partionswap(arr, start, end);
			quick(arr, start, p-1);
			quick(arr, p+1, end);
			
		}
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QuickSort obj=new QuickSort();
		int[] arr = new int[] { 6, 4, 7, 3, 5, 4, 15, 9, 17,12,3 };
		obj.quick(arr, 0, arr.length-1);
      
		
		for (int r : arr) {
			System.out.print(r + " ");
		}
	}

}
