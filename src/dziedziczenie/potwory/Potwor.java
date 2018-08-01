package dziedziczenie.potwory;

public abstract class Potwor {

	private double speed = 10;
	private double zywotnosc;

	public void atakuj() {
		System.out.println("ATAK!");
	}

	abstract void opis();
	{

	}

	public double getSpeed() {
		return this.speed;
	}

	public double getZywotnosc() {
		return this.zywotnosc;
	}

	public void setSpeed(final double speed) {
		this.speed = speed;
	}

	public void setZywotnosc(final double zywotnosc) {
		this.zywotnosc = zywotnosc;
	}

	public Potwor() {

	}
}
