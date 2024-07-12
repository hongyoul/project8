package inheritance;

public class Ex1 {

	public static void main(String[] args) {
		
		
		Child child = new Child();
		
		//참조변수 . 클래스 이름
		child.nationality = "한국"; // 부모클래스에서 물려받음 기능
		child.lastName = "김"; // 부모클래스에서 물려받음 기능
		child.firstName = "아무개"; // 자식클래스에서 물려받음 기능

	}

}

// 부모 클래스
class Parents{
	String nationality; // 국적
	String lastName; // 성
}

// 자식 클래스
class Child extends Parents{ // 상속은 자식에서 받음 => extends Parents (키워드 + 부모클래스 이름)
	String firstName; // 이름 * 보이지는 않지만 부모클래스의 국적, 성이 추가 되는것 
}