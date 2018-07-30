package programowanieobiektowe;

public class ProgramowanieObiektowe {
	public static void main(String[] args) {
		System.out.println("test");
		Test a = new Test();

		a.wypisz("arek");
		System.out.println(a.dodaj(2, 3));
		double wynik = a.dodaj(4.15, 24.23);
		System.out.println(wynik);
	}
}

class Test {
	void wypisz(String imie) {
		System.out.println(imie);
	}

	int dodaj(int a, int b) {
		return a + b;
	}

	double dodaj(double a, double b) {
		return a + b;
	}
}