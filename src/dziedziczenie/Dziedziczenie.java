package dziedziczenie;

import dziedziczenie.potwory.Potwor;
import dziedziczenie.potwory.Szkielet;
import dziedziczenie.potwory.Zombie;

public class Dziedziczenie {

	public static void main(String[] args) {
		Potwor p = new Szkielet();
		p.atakuj();
		p.setSpeed(10);
		p.setZywotnosc(50);
		Szkielet szkielet = new Szkielet();
		szkielet.setSpeed(15);
		szkielet.setZywotnosc(30);
		System.out.println(szkielet.getSpeed());
		Zombie zombie = new Zombie();
		szkielet.atakuj();
	}
}
