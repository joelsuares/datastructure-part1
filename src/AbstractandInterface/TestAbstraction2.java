package AbstractandInterface;

abstract class bike{
	bike(){
		System.out.println("Bike Started");
	}
	
	abstract void run();
	void gear(){
		System.out.println("Gear cahnged Succefully");
	}
} 

class Honda1 extends bike{
	void run(){
		System.out.println("Bike runniug Succesfully");
	}
}

public class TestAbstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bike obj; 
		obj=new Honda1();
		obj.run();
		obj.gear();
		

	}

}
