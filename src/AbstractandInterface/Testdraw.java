package AbstractandInterface;

abstract class shape {

	abstract void draw();
}

class Rectangle extends shape{
	void draw(){
		System.out.println("drawinf rectangle");
	}
}

class Circle extends shape{
	void draw(){
		System.out.println("Drawing circle");
	}
}

public class Testdraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		shape obj=new Circle();
		obj.draw();
	}

}
