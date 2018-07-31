package dziedziczenie.potwory;

public class Szkielet extends Potwor {

	private String typBroni = "Miecz";

	public String getTypBroni() {
		return this.typBroni;
	}

	public void setTypBroni(final String typBroni) {
		this.typBroni = typBroni;
	}

	@Override
	public void atakuj() {
		System.out.println("ATAK Szkieleta!");
	}
}
