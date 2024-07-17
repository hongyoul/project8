package override.quiz;

/*
 * 동물, 고양이, 강아지 클래스를 정의하세요.
 * 동물클래스에서 상속받은 메소드를 재정의하세요 eat(), sound()
 * */

public class Quiz1 {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.eat();
		cat.sound();
		dog.eat();
		dog.sound();
	}

}

class Animal{
	String eat;
	String sound;
	
	public void eat() {
		System.out.println("먹이를 먹는다.");
		System.out.println();
	}
	public void sound() {
		System.out.println("짖는다.");
	}
}

class Cat extends Animal{

	// 오버라이드() 규칙: 선언부 그대로 구현부 변경
	@Override
	public void eat() { // <-선언부
		System.out.println("고양이는 쥐를 먹는다."); // <-구현부
	//	super.eat(); <-구현부
	}

	@Override
	public void sound() {
		System.out.println("고양이는 야옹하고 짖는다.");
	//	super.sound();
	}
	
}

class Dog extends Animal{

	@Override
	public void eat() {
		System.out.println("강아지는 고기를 먹는다.");
	//	super.eat();
	}

	@Override
	public void sound() {
		System.out.println("강아지는 멍멍하고 짖는다.");
	//	super.sound();
	}
	
}