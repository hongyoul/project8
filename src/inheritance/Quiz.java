package inheritance;

//동물(Animal)을 정의하는 클래스를 만드세요.
//속성: 다리
//동물 클래스를 상속받는 호랑이(Tiger) 클래스를 만드세요.
//속성: 꼬리
//동물 클래스를 상속받는 독수리(Eagle) 클래스를 만드세요.
//속성: 날개
//
//호랑이 인스턴스를 생성하세요.(다리4개, 꼬리1개)
//독수리 인스턴스를 생성하세요.(다리2개, 날개2개)

public class Quiz {

	public static void main(String[] args) {
		
		//호랑이 인스턴스를 생성하세요.(다리4개, 꼬리1개)
		Tiger tiger = new Tiger();
		
		tiger.leg = 4;
		tiger.tail = 1;
		
		System.out.println("호랑이: 다리" + tiger.leg + "개 " + "," + "꼬리" + tiger.tail + "개 입니다");
		
		//독수리 인스턴스를 생성하세요.(다리2개, 날개2개)
		Eagle eagle = new Eagle();
		eagle.leg = 2;
		eagle.wing = 2;
		
		System.out.println("독수리: 다리" + eagle.leg + "개 " + "," + "날개" + eagle.wing + "개 입니다");

	}

}

// 동물 클래스
class Animal {
	int leg; // 다리
}

//호랑이 클래스
class Tiger extends Animal{
	int tail; // 꼬리
}

// 독수리 클래스
class Eagle extends Animal{
	int wing; // 날개
}