package RecurrisonRepeat;

public class NaturalNum {
	
	public void naturalnum(int start,int end){
		
		if(start>end){
			return;
		}
		
		System.out.println(start);
		 naturalnum(start+1, end);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NaturalNum obj=new NaturalNum();
		obj.naturalnum(0, 100);

	}

}
