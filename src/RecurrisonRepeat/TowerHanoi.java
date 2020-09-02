package RecurrisonRepeat;

public class TowerHanoi {

	// public void tower(int n, char source,char des,char aux){
	//
	// if(n==1){
	// System.out.println("Move disk 1 from source "+source+" To peg "+des);
	// return;
	// }
	//
	// tower(n-1, source, aux, des);
	// System.out.println("Moving disk from "+source+" to other "+des);
	// tower(n-1, aux, des, source);
	// }

	public void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
		if (n == 1) {
			System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod);
			return;
		}
		towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
		System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
		towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
	}

	public static void main(String[] args) {

		TowerHanoi obj = new TowerHanoi();

		obj.towerOfHanoi(3, 'a', 'c', 'b');

	}

}
