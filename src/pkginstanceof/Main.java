package pkginstanceof;

public class Main {

	public static void main(String[] args) {


		Osoba[] osoba = new Osoba[4];
		osoba[0] = new Pracownik("Adam", "Tkacz", 2000);
		osoba[1] = new Student("Kasia", "Tkacz");
		osoba[2] = new Pracownik("Adam1", "Tkacz1", 20005);

		for (Osoba person: osoba) {

			if (person instanceof Pracownik) {
				((Pracownik)person).pracuj();
			}
			else if (person instanceof Student)
				((Student)person).pobierzOpis();
			else
				continue;
		}
	}
}
abstract class Osoba {
	String imie;
	String nazwisko;

	Osoba(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	abstract void pobierzOpis();
}

class Pracownik extends Osoba
{
	double wynagrodzenie;

	Pracownik(String imie, String nazwisko, double wynagrodzenie) {
		super(imie, nazwisko);
		this.wynagrodzenie = wynagrodzenie;
	}

	@Override
	void pobierzOpis() {
		System.out.println("Pracownik");
	}

	void pracuj() {
		System.out.println("Ja pracuje");
	}
}

class Student extends Osoba {

	Student(String imie, String nazwisko) {
		super(imie, nazwisko);
	}

	@Override
	void pobierzOpis() {
		System.out.println("Student");
	}

}
