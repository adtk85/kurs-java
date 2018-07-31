package referencje;

public class Referencje {
	public static void main(String[] args) {
		int a = 5;
		Test x = new Test();

		a = x.zmienWartosc(a);
		System.out.println(a);

		Foo foo = new Foo();
		x.zmienZawartosc(foo);

		System.out.println(foo.y);
	}
}

class Test {

	int zmienWartosc(int zm) {
		zm = zm + 2;
		return zm;
	}

	void zmienZawartosc(Foo zm) {
		zm.y = zm.y + 40;
	}
}

class Foo {
	int y = 20;
}