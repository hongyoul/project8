package override.quiz;

/*
 * 동물, 고양이, 강아지 클래스를 정의하세요.
 * 동물클래스에서 상속받은 메소드를 재정의하세요 eat(), sound()
 * */

public class Quiz2 {

	public static void main(String[] args) {
		Coffee coffee1 = new Coffee();
		coffee1.taste();
		
		Coffee coffee2 = new Americano();
		coffee2.taste();
		
		Coffee coffee3 = new CafeLatte();
		coffee3.taste();
	}

}

class Coffee{
	String taste;
	
	public void taste() {
		System.out.println("커피를 마신다.");
		
	}
}

class Americano extends Coffee{

	@Override
	public void taste() {
		System.out.println("아메리카노를 마신다.");
	//	super.eat();
	}
}

class CafeLatte extends Coffee{

	@Override
	public void taste() {
		System.out.println("카페라떼를 마신다.");
	//	super.eat();
	}
}