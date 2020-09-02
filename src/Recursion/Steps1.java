package Recursion;

public class Steps1 {

	public void stair(int arr[], int index, int length) {

		int count=0;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Steps1 obj=new Steps1();
		obj.stair(new int[4], 0, 4);

	}

}
