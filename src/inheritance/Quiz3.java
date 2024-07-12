package inheritance;

public class Quiz3 {

	public static void main(String[] args) {
		
		Bolpen bolpen = new Bolpen();
		bolpen.thickness = 2;
		bolpen.amount = 100;
		bolpen.bolpenColor ="파랑색";
		
		System.out.println("펜의 굵기: " + bolpen.thickness);
		System.out.println("남은 양: " + bolpen.thickness);
		System.out.println("볼펜의 색: " + bolpen.thickness);
		
		System.out.println();
		
		Fountain fountain = new Fountain();
		fountain.thickness = 3;
		fountain.amount = 80;
		fountain.famous ="몽블랑";

		System.out.println("펜의 굵기: " + fountain.thickness);
		System.out.println("남은 양: " + fountain.amount);
		System.out.println("브랜드: " + fountain.famous);
	}

}
// 펜 클래스
class Pen {
	int thickness;
	int amount;
}

// 볼펜 클래스
class Bolpen extends Pen{
	String bolpenColor;
	
}

// 만년필 클래스
class Fountain extends Pen{
	String famous;
}
