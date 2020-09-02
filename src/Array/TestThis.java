package Array;

public class TestThis {

	static int i;
	int j;

	void values(int a, int b) {
		i = a;
		j = b;
	}

	void add() {
		System.out.println(i + j);
	}

	void mul() {
		System.out.println(i * j);
	}

	public static void main(String[] args) {
		TestThis t = new TestThis();
		
		
		t.values(100, 200);
		t.add();
		t.mul();
		System.out.println(i);
		System.out.println(t.j);
	}
}
