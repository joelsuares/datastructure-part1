package Sorting;

public class PartiotionSwap {
	
	int partionswap(int arr[],int start, int end){
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PartiotionSwap obj=new PartiotionSwap();
		int[] arr = new int[] { 6, 4, 7, 3, 5, 4, 15, 9, 17,12,3 };
		int partionswap = obj.partionswap(arr, 0, arr.length-1);
		System.out.println(partionswap);
		
		for (int r : arr) {
			System.out.print(r + " ");
		}
		
		
		
	}

}
