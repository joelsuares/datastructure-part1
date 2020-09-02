package RecurrisonRepeat;

public class Power {

	public int pwr(int num, int exponet) {
		if (exponet == 0) {
			return 1;
		}

		return num * pwr(num, exponet - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Power obj = new Power();
		int pwr = obj.pwr(10, 3);
		System.out.println(pwr);

	}

}
