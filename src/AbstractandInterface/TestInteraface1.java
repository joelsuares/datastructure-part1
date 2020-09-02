package AbstractandInterface;

interface Drawable {
	void draw();
}

class Rectangele implements Drawable {
	public void draw() {
		System.out.println("Drawing rectangle");
	}
}

class Round implements Drawable {
	public void draw() {
		System.out.println("Drawing circle");
	}
}

public class TestInteraface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Drawable obj;
		obj = new Round();
		obj.draw();
		obj = new Rectangele();
		obj.draw();
	}

}
