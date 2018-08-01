package finalkeyword;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		final double PI = 3.14;
		Pracownik p = new Pracownik();
		System.out.println(p.datazatrudnienia);
	}
}

abstract class Osoba {

}

class Pracownik extends Osoba {

	Pracownik() {
		this.datazatrudnienia = new Date();
	}

	final Date datazatrudnienia;
}