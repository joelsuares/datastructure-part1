package Recursion;

public class BinaryLetter {

	public void binaryletter(int[] arr, int index) {

		if(arr.length==index){
			for(int i=0; i<arr.length; i++){
				System.out.print((char)arr[i]);
			}
			System.out.println();
			return;
		}
		
		arr[index] = 65;
		binaryletter(arr, index + 1);
		arr[index] = 66;
		binaryletter(arr, index + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BinaryLetter obj=new BinaryLetter();
		obj.binaryletter(new int[3], 0);
	}

}
