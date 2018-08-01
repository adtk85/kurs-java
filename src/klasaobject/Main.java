package klasaobject;

public class Main {

	public static void main(String[] args) {
		Object a = new Punkt(4, 50);
		Punkt p = new Punkt(4,10);
		Punkt p2 = new Punkt(4,10);

		System.out.println(p.getClass());

		if (p==p2)
			System.out.println("równe");
		if (p.equals(p))
			System.out.println("rowne");
		System.out.println(p);
		System.out.println(p);
	}
}

class Punkt extends Object {

	private int x;
	private int y;

	Punkt() {

	}
	Punkt(int x, int y) {
		this.x = x;
		this.y = y;
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	@Override
	public boolean equals(Object o){

		if (o == null)
			return false;
		if (this == o)
			return true;
		if (this.getClass() != o.getClass())
			return false;
		Punkt przyslany;
		przyslany = (Punkt) o;

		return this.x == przyslany.x && this.y == przyslany.y;
	}

	public String toString() {
		return getX() + "" + getY();
	}
}