import kr.tpc.A;
import kr.tpc.B;

public class TPC29 {
	public static void main(String[] args) {
		
		Object a = new A();
		display(a);
		Object b = new B();
		display(b);
		
	}

	private static void display(Object o) {
		if (o instanceof A) {
			((A)o).go();
		} else {
			((B)o).go();
		}
	}
}
