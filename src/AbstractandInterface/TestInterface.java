package AbstractandInterface;

interface printable {
	void print();
}

public class TestInterface implements printable {

	public void print() {
		System.out.println("HELLO");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printable obj = new TestInterface();
		obj.print();

	}

}
