package typecasting.quiz;

/*
 * 부모클래스와 자식클래스를 정의하세요.
 * 부모클래스 참조변수를 선언하고 자식 클래스로 생성한 인스턴스를 대입하세요.
 * 그리고 자식클래스의 정보를 출력하세요.
 * */

public class Quiz1 {

	public static void main(String[] args) {

		// 제약 사항이 있음 부모의 값만 나타낼수 있음
		Parents pc = new Child( "한국", "이", "유리");
		
		System.out.println(pc.lastName);
		System.out.println(pc.nationality);
	
		// pc변수로 자식클래스의 이름은 사용할 수 없음
		// System.out.println(pc.firstName);
		
		Child ch = new Child("한국", "이", "유리");
		
		System.out.println(ch.lastName);
		System.out.println(ch.nationality);
		
		//ch변수로 자식클래스의 이름은 사용할 수 있음
		System.out.println(ch.firstName);
		
	}
}

class Parents {
	String nationality;
	String lastName;
	
	public Parents(String nationality, String lastName) {
		super();
		this.nationality = nationality;
		this.lastName = lastName;
	}


	
}

class Child extends Parents {
	String firstName;

	public Child(String nationality, String lastName, String firstName) {
		super(nationality, lastName);
		this.firstName = firstName;
		
	}
}