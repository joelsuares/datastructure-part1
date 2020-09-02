package SortingReapeat;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 4, 2, 22, 41, 13, 63, 21, 14, 76, 13, 12 };
		
		
		for(int i=1; i<arr.length; i++){
			int j=i-1;
			int key=arr[i];
			
			while(j>=0 && key<arr[j] ){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			
			
		}
		for(int insert:arr){
			System.out.print(insert+" ");
		}
		
		
		
	}

}
