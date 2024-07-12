package inheritance;

public class Ex3 {

	public static void main(String[] args) {
		
		// 일반 회원 생성
		Customer customer = new Customer();
		customer.customerName = "지현";
		customer.calcPrice(10000);
		customer.showInfo();
		
		// vip 회원 생성
		VIPCustomer vip = new VIPCustomer();
		vip.customerName = "또치";
		vip.calcPrice(10000);
		vip.showInfo();
	}

}

// 일반회원 클래스
class Customer {
	
	String customerName; // 이름
	String customerGrade; // 일반 회원 등급은 고정
	double bonusPoint; // double 실수(소수점) 으로 타입 설정
	double bonusRatio; // 일반회원 적립률은 고정
	
	// 고정값은 생성자에서 초기화 작성
	public Customer() {
		
		// 일반회원 고정값 목록(등급, 적립률)
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
		
	// 보너스 포인트 적립하고, 지불 가격을 계산하는 메소드
	public void calcPrice(int price) { 
		
		bonusPoint = bonusPoint + (price * bonusRatio); //보너스 포인트
		System.out.println(customerName + "님이 " + price + "원을 결제하였습니다.");
	}
	
	public void showInfo() {
		System.out.println(customerName + "님의 등급은 " + customerGrade + "이먀, 보너스 포인트는 " + bonusPoint + "입니다.");
	}
}

// VIP 회원 클래스
class VIPCustomer extends Customer {
	double discount; // 할인률
	
	// 고정값은 생성자에서 초기화
	public VIPCustomer() {
		
		// VIP 고정값 목록(등급, 적립률, 할인률)
		customerGrade = "VIP";
		bonusRatio = 0.05;
		discount = 0.1;
	}
}