package override.quiz;

/*
 * 동물, 고양이, 강아지 클래스를 정의하세요.
 * 동물클래스에서 상속받은 메소드를 재정의하세요 eat(), sound()
 * */

public class Quiz3 {

	public static void main(String[] args) {
	
		Computer computer = new Computer();
		computer.on();
		computer.off();
		
		Notebook notebook = new Notebook();
		notebook.on();
		notebook.off();
		
		Desktop desktop = new Desktop();
		desktop.on();
		desktop.off();
	}

}

class Computer{
	String on;
	String off;
	
	public void on() {
		System.out.println("컴퓨터를 켭니다.");
	}
	public void off() {
		System.out.println("컴퓨터를 끕니다.");
	}
}

class Notebook extends Computer{

	@Override
	public void on() {
		System.out.println("노트북을 켭니다.");
	}

	@Override
	public void off() {
		System.out.println("노트북을 끕니다.");
	}
}

class Desktop extends Computer{

	@Override
	public void on() {
		System.out.println("데스크탑을 켭니다.");
	}

	@Override
	public void off() {
		System.out.println("데스크탑을 끕니다.");
	}
	
}