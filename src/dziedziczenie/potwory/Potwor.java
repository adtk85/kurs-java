package dziedziczenie.potwory;

public class Potwor {

	private double speed = 10;
	private double zywotnosc;

	public void atakuj() {
		System.out.println("ATAK!");
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
