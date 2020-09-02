package RecurrisonRepeat;

public class SumOfNaturalNum {

	public int sumOfNatural(int start, int end) {

		if (start == end) {
			return start;
		}

		return start + sumOfNatural(start + 1, end);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumOfNaturalNum obj = new SumOfNaturalNum();
		int sumOfNatural = obj.sumOfNatural(0, 6);
		System.out.println(sumOfNatural);

	}

}
