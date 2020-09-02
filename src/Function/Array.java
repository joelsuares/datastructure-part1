package Function;


public class Array {

	public void printArr(int[] a){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public void fillarray(int[] p){
		p[0]=10;
		p[1]=20;
		p[2]=30;
		p[3]=40;
		p[4]=50;
		
		printArr(p);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr=new int[5];
		
		Array d=new Array();
		d.fillarray(arr);
		System.out.println("main method");
	}

}
