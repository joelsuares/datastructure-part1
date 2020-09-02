package Sorting;

public class Sort1and0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr=new int[]{1,0,1,0,0,1,0,1,1,0,0,1};
		
		int i=0; 
		int j=arr.length-1;
		
		while(i<j){
			
			while(arr[i]==0){
				i++;
			}
			while(arr[j]==1){
				j--;
			}
			
			if(i<j){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
			
		}
		
	for(int k=0; k<arr.length; k++){
		System.out.print(arr[k]+" ");
	}
	}

}
