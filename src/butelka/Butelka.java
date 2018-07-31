package butelka;

public class Butelka {

	private double ileLitrow;
	private double pojemnosc;

	Butelka(double ileLitrow, double pojemnosc) {
		this.ileLitrow = ileLitrow;
		this.pojemnosc = pojemnosc;
	}

	double getIleLitrow() {
		return ileLitrow;
	}

	void wlej(double ilosc) {
		if (this.ileLitrow + ilosc <= pojemnosc) {
			this.ileLitrow += ilosc;
		}
		else {
			this.ileLitrow = pojemnosc;

		}

	}

	void wylej(double ilosc) {
		if (ileLitrow >= ilosc)
			this.ileLitrow -= ilosc;
		else {
			System.out.println("wylewasz całość");
			this.ileLitrow = 0;
		}

	}

	void przelej(double ilosc, Butelka gdzie) {

		double roznica = ilosc - (gdzie.pojemnosc - gdzie.ileLitrow);

		if (roznica < 0) {
			this.wylej(ilosc);
			gdzie.wlej(ilosc);
		}
		else {
			this.wylej(ilosc - roznica);
			gdzie.wlej(ilosc - roznica);
		}
	}


	public static void main(String[] args) {

		Butelka[] butelka = new Butelka[3];
		int i;
		for (i = 0; i < butelka.length; i++) {
			butelka[i] = new Butelka(0, 20);
			System.out.println(butelka[i].getIleLitrow());
		}
		butelka[2] = new Butelka(0, 30);
		butelka[0].wlej(20);
		butelka[2].wlej(25);
		System.out.println(butelka[0].getIleLitrow());
		System.out.println(butelka[2].getIleLitrow());

		butelka[0].przelej(30, butelka[2]);
		System.out.println(butelka[0].getIleLitrow());
		System.out.println(butelka[2].getIleLitrow());
	}
}

