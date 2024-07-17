package override;



public class Ex1 {

	public static void main(String[] args) {
		
		Customer customer = new Customer("둘리");
		customer.calcPrice(10000);
		customer.showInfo();
		
		VIPCustomer vipCustomer = new VIPCustomer("자수");
		vipCustomer.calcPrice(10000);
		vipCustomer.showInfo();

	}

}
//일반회원 클래스
class Customer {

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	String customerName; // 이름
	String customerGrade; // 일반 회원 등급은 고정
	double bonusPoint; // double 실수(소수점) 으로 타입 설정
	double bonusRatio; // 일반회원 적립률은 고정

	// 고정값은 생성자에서 초기화 작성
	public Customer(String customerName) {
		this.customerName = customerName;

		// 일반회원 '고정값' 목록(등급, 적립률)
		customerGrade = "SILVER";
		bonusRatio = 0.01;

	}

	// 보너스 포인트 적립하고, 지불 가격을 계산하는 메소드
	public void calcPrice(int price) {

		bonusPoint = bonusPoint + (price * bonusRatio); // 보너스 포인트
		System.out.println(customerName + "님이 " + price + "원을 결제하였습니다.");
	}

	public void showInfo() {
		System.out.println(customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.");
	}
}

//VIP 회원 클래스
class VIPCustomer extends Customer {
	double saleRatio; // 할인률

	// 고정값은 생성자에서 초기화
	public VIPCustomer(String customerName) {
		super(customerName); // 부모의 생성자 초기화 이름과 동일해야함

		// VIP '고정값' 목록(등급, 적립률, 할인률)
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		
	}

	@Override
	public void calcPrice(int price) {
	
		bonusPoint =bonusPoint + (price * bonusRatio);
		int salePrice = price - (int)(price * saleRatio);
		System.out.println(customerName + " 님이" + salePrice + "원을 결제했습니다.");
		// super.calcPrice(price);
	}

}