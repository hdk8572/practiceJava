import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC22 {
	public static void main(String[] args) {
		
		// upcasting
		Animal ani = new Cat();
		ani.eat();
		
//		Cat c = (Cat)ani;
//		c.night();
		
		((Cat)ani).night();
		
		ani = new Dog();
		ani.eat();
		
	}
}
