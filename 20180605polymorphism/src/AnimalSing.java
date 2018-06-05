import java.util.*;

public class AnimalSing {
	List<Animal> list; // Animal의 자식클래스를 가질 수 있다.
	AnimalSing() {
		list = new ArrayList<Animal> ();
	}
	void add(Animal ele) { // Dog, Cat 클래스들이 들어오면 Animal 클래스로 Upcasting
		list.add(ele);
	}
	void sing() {
		Animal ele;
		Iterator<Animal> e = list.iterator();
		while(e.hasNext()) {
			ele = e.next();
			ele.sing(); // polymorphism. c에서는 if문을 써서 복잡하게 풀어써야한다
		}
	}
}
