package override;



public class Ex2 {

	public static void main(String[] args) {
		
		// 형변환된 변수로 계산하기!
		Customer vc = new VIPCustomer("지수"); // 형변환 실행
		vc.calcPrice(10000); //
		
		// 실제 객체가 가지고 있는 재정의된 함수 호출
	}

}
