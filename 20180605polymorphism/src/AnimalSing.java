import java.util.*;

public class AnimalSing {
	List<Animal> list; // Animal�� �ڽ�Ŭ������ ���� �� �ִ�.
	AnimalSing() {
		list = new ArrayList<Animal> ();
	}
	void add(Animal ele) { // Dog, Cat Ŭ�������� ������ Animal Ŭ������ Upcasting
		list.add(ele);
	}
	void sing() {
		Animal ele;
		Iterator<Animal> e = list.iterator();
		while(e.hasNext()) {
			ele = e.next();
			ele.sing(); // polymorphism. c������ if���� �Ἥ �����ϰ� Ǯ�����Ѵ�
		}
	}
}
