package day5;

class Test {
	void m1(int i) throws ArithmeticException {
		System.out.println(100 / i);
	}

	void m2() {
		m1(0);
		/* try { m1(0); } catch
		 * (ArithmeticException e) {
		 * System.out.println(e.
		 * getMessage()); } */
	}

	void m3() {
		try {
			m1(0);
		} catch (ArithmeticException e) {
			m1(100);
		}

	}
}

public class ThrowsTest {

	public static void main(String[] args) {
		Test t = new Test();
		t.m2();
	}

}
