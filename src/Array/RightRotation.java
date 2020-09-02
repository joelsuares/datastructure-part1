package Array;

public class RightRotation {

	public void RightRotate(int arr[], int d, int n) {

		for(int i=1; i<=d; i++){
		rightrotateByone(arr, n);	
		}
	}
	
	public void rightrotateByone(int arr[], int n){
	
		int i;
		int temp=arr[arr.length-1];
		
		
		for(i=arr.length-1; i>0; i--){
			arr[i]=arr[i-1];
		}
		arr[i]=temp;
		
	}
	
	public void print(int arr[]) {

		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		for (int a : arr) {
			System.out.print(a + " ");
		}

		//LeftRoationArray obj = new LeftRoationArray();
		RightRotation obj=new RightRotation();
		
		obj.RightRotate(arr, 3, arr.length);
		System.out.println();
		obj.print(arr);


	}

}
