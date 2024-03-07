import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC25 {

	public static void main(String[] args) {
		// 재정의 (Override)
		Animal ani = new Dog();
		ani.eat(); // {?} --> {개}
		
		ani = new Cat();
		ani.eat(); // {?} --> {고}
		
	}
}
