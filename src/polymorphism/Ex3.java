package polymorphism;

public class Ex3 {

	public static void main(String[] args) {

								 //   부모타입 (변수) = 자식 타입(객체)
		moveAnimal(new Human()); // Animal animal = new Human()
		moveAnimal(new Tiger()); // Animal animal = new Tiger()
		moveAnimal(new Eagle()); // Animal animal = new Eagle()
		
		
	}

	public static void moveAnimal(Animal animal) {
		animal.move(); // 재정의된 메소드 호출 됨
	}
	
}


