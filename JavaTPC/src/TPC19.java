import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC19 {
	public static void main(String[] args) {
		
		Dog d = new Dog();
		//d.eat();
		
		Cat c = new Cat();
		//c.eat();
		
		
		
		Animal ani = new Dog();
		ani.eat();
		ani = new Cat();
		ani.eat();
		
		
		
	}
}
