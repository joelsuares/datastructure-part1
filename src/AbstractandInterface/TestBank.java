package AbstractandInterface;

abstract class Rbi {
	abstract int getintrest();
}

class Sbi extends Rbi {
	int getintrest() {
		return 7;
	}
}

class Hdfc extends Rbi {
	int getintrest() {
		return 9;
	}
}

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rbi obj;
		obj = new Sbi();
		System.out.println(obj.getintrest());
		obj = new Hdfc();
		System.out.println(obj.getintrest());
	}

}
