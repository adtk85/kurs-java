package statycznosc;

public class Statycznosc {
	public static void main(String[] args) {
		double wynik = Matematyka.dodaj(10, 15);
		System.out.println(wynik);
		System.out.println(Matematyka.PI);

		Klient a = new Klient("a");
		Klient b = new Klient("b");
		Klient c = new Klient("c");

		System.out.println(a.id);
		System.out.println(b.id);
		System.out.println(c.id);
	}
}

class Klient {
	Klient(String imie) {
		this.imie = imie;
		nastepnyId++;
		id = nastepnyId;
	}

	String imie;
	int id = 0;
	static int nastepnyId;
}