package inheritance;

//베이직티비(BasicTV)을 정의하는 클래스를 만드세요.
//속성: 전원상태, 채널, 볼륨
//
//베이직티비 클래스를 상속받는 스마트티비(SmartTV) 클래스를 만드세요.
//속성: 아이피
//
//베이직티비 인스턴스를 생성하세요. (전원 상태:on, 채널:7, 볼륨:20)
//스마트티비 인스턴스를 생성하세요. (전원 상태:on, 채널:11, 볼륨:30, 아이피:192.168.0.111)
//모든 인스턴스의 정보를 출력하세요

public class Quiz2 {

	public static void main(String[] args) {
		
		BasicTV basicTV = new BasicTV();
		
		basicTV.onOff = "on";
		basicTV.channel = 7;
		basicTV.volume = 20;
		
		System.out.println("전원 상태: " + basicTV.onOff + ", 채널: " +  basicTV.channel + ", 볼륨: " + basicTV.volume);
		
		
		SmartTV smartTV = new SmartTV();
		
		smartTV.onOff = "on";
		smartTV.channel = 11;
		smartTV.volume = 30;
		smartTV.ip = "192.168.0.111";
		
		System.out.println("전원 상태: " + smartTV.onOff + ", 채널: " + smartTV.channel + ", 볼륨: " + smartTV.volume + ", 아이피: " + smartTV.ip);
	}

}

// 베이직티비 클래스
class BasicTV {
	String onOff;
	int channel;
	int volume;
}

// 스마트티비 클래스
class SmartTV extends BasicTV {
	String ip;
}

