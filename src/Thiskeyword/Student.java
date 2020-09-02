package Thiskeyword;

class Test{
	int rollnum;
	float fee;
	String name;
	
	Test(int rollnum,float fee,String name){
		this.rollnum=rollnum;
		this.fee=fee;
		this.name=name;
	}
	
	void display(){
		System.out.println(rollnum+" "+name+" "+fee);
	}
}


public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test obj=new Test(1000,100,"Joel");
		Test obj1=new Test(10000,1000,"MOhan");
		
		obj.display();
		obj1.display();
		
	}

}
