package AbstractandInterface;

abstract class bike1 {
	abstract void run();
}

public class Honda extends bike1 {
	void run() {
		System.out.println("Running Safelly");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bike1 obj = new Honda();
		obj.run();

	}

}
