package polymorphism.quiz;

/*
 * 자동차, 버스, 스포츠카 클래스를 정의하세요.
 * 자동차 클래스에서 상속받는 메소드를 재정의하세요 run()
 * 버스와 스포츠카 객체를 매개변수로 받는 메소드를 정의하고 run()메소드를 호출하세요.
 * */

public class Quiz1 {

	public static void main(String[] args) {
		runCar(new Bus());
		runCar(new SportsCar());
	}

	public static void runCar(Car car) {
		car.run();
	}
}

// 자동차 클래스
class Car {
	
	public void run() {
		System.out.println("자동차가 달린다");
	}
}

// 버스 클래스
class Bus extends Car {
	
	@Override
	public void run() { 
		System.out.println("버스가 달린다");
	}
}

// 스포츠카 클래스
class SportsCar extends Car {
	
	@Override
	public void run() { 
		System.out.println("스포츠카가 달린다");
	}
}