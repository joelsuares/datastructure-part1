package Recursion;

public class Steps {

	public void stair(int arr[], int index, int length) {

		if (length < 0) {
			return;
		}
		if (length == 0) {
			for (int i = 0; i < index; i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
			

			return;
		}

		arr[index] = 1;
		stair(arr, index + 1, length - 1);
		arr[index] = 2;
		stair(arr, index + 1, length - 2);
	}
	
	public int stairCount(int length){
		if(length<0){
			return 0;
		}else if(length==0) {
			return 1;
		}else{
			return stairCount(length-1)+stairCount(length-2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Steps obj = new Steps();
		obj.stair(new int[5], 0, 5);

		System.out.println("**************************");
		int stairCount = obj.stairCount(4);
		System.out.println(stairCount);
	}

}
