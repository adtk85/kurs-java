package interfejsy;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

	nazwaInterfejsu p = new Pracownik();
		System.out.println((Pracownik.PI));

		int[] tab = new int[3];
		tab[0] = 3;
		tab[1] = 4;
		tab[2] = 1;
		Arrays.sort(tab);
		System.out.println(tab[0]);
	}
}

interface nazwaInterfejsu {
	double PI = 3.14;

	void cos();

}

interface cosik {
	void cosik();
}

class Pracownik implements nazwaInterfejsu, cosik {

	@Override
	public void cos() {

	}

	@Override
	public void cosik() {

	}
}
