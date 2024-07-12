package inheritance;

public class Quiz4 {

	public static void main(String[] args) {
		
		Monster monster = new Monster();
		
		monster.attack = 10;
		monster.health = 100;
		
		System.out.println("몬스터의 공격은 " + monster.attack + "이고 체력은 " + monster.health + "이다.");
		
		monster.Action(10);

		System.out.println();
		
		Slime slime = new Slime();
		slime.attack = 30;
		slime.health = 200;
		slime.skill = "마비";
		
		System.out.println("몬스터의 공격은 " + slime.attack + "이고 체력은 " +slime.health + "이다.");
		slime.Action(30);
		slime.doSkill(slime.skill);
		System.out.println();
	}

}

// 몬스터 클래스
class Monster{
	int attack;
	int health;
	
	public void Action(int action) {
		System.out.println("몬스터가 " + action + "만큼 공격했다!");	
	}

	public void Information() {
		System.out.println("정보를 보여준다");
	}
	
}
// 슬라임 클래스
class Slime extends Monster{
	String skill;
	
	public void doSkill(String skill ) {
		System.out.println("슬라임은 " + skill + "을 시전했다!");
	}
}

// 모범답안
//Monster monster = new Monster(); // 몬스터 생성
//monster.atack = 10;
//monster.health = 100;
//monster.showInfo();
//monster.doAttack();
//System.out.println();
//
//Slime slime = new Slime(); // 슬라임 생성
//slime.atack = 30; // 부모클래스에서 물려받은 속성
//slime.health = 200; // 부모클래스에서 물려받은 속성
//slime.skill = "마비";
//slime.showInfo(); // 부모클래스에서 물려받은 기능
//slime.doAttack(); // 부모클래스에서 물려받은 기능
//slime.doSkill();
//}
//
//}
//
////몬스터 클래스
//class Monster {
//int atack; // 공격력
//int health; // 체력
//
//public void doAttack() {
//System.out.println("몬스터가 " + atack + "만큼 공격했다!");
//}
//
//public void showInfo() {
//System.out.println("몬스터의 공격력은 " + atack + "이고 체력은 " + health + "이다.");
//}
//}
//
////슬라임 클래스
//class Slime extends Monster {
//String skill; // 스킬
//
//public void doSkill() {
//System.out.println("슬라임이 " + skill + "을 시전했다!");
//}
//
//}