package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>  list=new ArrayList<String>();
		
		list.add("Ravi");
		list.add("mohan");
		list.add("Joel");
		list.add("nithin");
		list.add("bharath");
		
		Iterator itr=list.iterator();
		//ask
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
