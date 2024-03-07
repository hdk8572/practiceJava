import kr.poly.Radio;
import kr.poly.Remocon;
import kr.poly.TV;

public class TPC26 {
	public static void main(String[] args) {
		
		Remocon r = new TV();
		
		r.chUp();
		r.chDown();
		r.internet();

		System.out.println("");
		
		r = new Radio();
		r.chUp();
		r.chDown();
		r.internet();

	}
}
