package RecurrisonRepeat;

public class StepsCount {

	public void stepcount(int[] arr, int index, int length) {

		if (length < 0) {
			return;
		}
		if(length==0){
			for(int i=0; i<index; i++){
				System.out.print(arr[i]);
			}
			System.out.println();
			return;
		}
		
		arr[index]=1;
		stepcount(arr, index+1, length-1);
		arr[index]=2;
		stepcount(arr, index+1, length-2);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StepsCount obj=new StepsCount();
		
		int a[]=new int[5];
		obj.stepcount(a, 0, 5);
	}

}
