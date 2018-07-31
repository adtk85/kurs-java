package enkapsulacja;

public class Enkapsulacja {
	public static void main(String[] args) {

		KontoBankowe oszczednosciowe = new KontoBankowe();
		oszczednosciowe.setSaldo(1001);
		if (oszczednosciowe.wyplata(500)) {
			System.out.println("wypłacono");
		}
		else
			System.out.println("brak srodkow");
		oszczednosciowe.wplata(100);
		System.out.println(oszczednosciowe.getSaldo());
	}
}

class KontoBankowe {

	public KontoBankowe() {
		saldo = 1000;
	}

	private int saldo;

	int getSaldo() {
		return saldo;
	}

	boolean setSaldo(int saldo) {

		this.saldo = saldo;

		return true;
	}

	boolean wyplata(int ile) {
		if (saldo < ile)
			return false;
		else
			setSaldo(saldo - ile);
		return true;
	}

	boolean wplata(int ile) {
		setSaldo(saldo + ile);
		return true;
	}
}