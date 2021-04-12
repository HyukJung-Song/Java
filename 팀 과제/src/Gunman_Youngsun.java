

import java.util.Random;

// 박영선
public class Gunman_Youngsun extends Player1 {

	// 궁수 능력치로 맞춤(파워 랜덤)
	public Gunman_Youngsun(String name) {
		this.hp = 90;
		this.name = name;
		this.defense = 5;
	}

	@Override
	public void attackP2(Base Player2) {
		Random r = new Random();
		this.power = r.nextInt(4) + 12;		// 12~15
		
		if (this.power == 12) { 
			int damage = this.power - Player2.defense;
			Player2.hp = Player2.hp - damage;
			System.out.println(this.name + "은(는) " + Player2.name + "에게 " + damage + "의 피해를 입혔다.");
		} else { 
			int damage = this.power;
			Player2.hp = Player2.hp - damage;
			System.out.println(this.name + "은(는) " + Player2.name + "에게 " + damage + "의 치명상을 입혔다. (>>> 헤드샷 공격!!)");
		}
		DeadOrLive(Player2);
	}

	@Override
	public void attackP3(Base Player3) {
		Random r = new Random();
		this.power = r.nextInt(4) + 12;		// 12~15
		
		if (this.power == 12) { 
			int damage = this.power - Player3.defense;
			Player3.hp = Player3.hp - damage;
			System.out.println(this.name + "은(는) " + Player3.name + "에게 " + damage + "의 피해를 입혔다.");
		} else { 
			int damage = this.power;
			Player3.hp = Player3.hp - damage;
			System.out.println(this.name + "은(는) " + Player3.name + "에게 " + damage + "의 치명상을 입혔다. (>>> 헤드샷 공격!!)");
		}
		DeadOrLive(Player3);
	}

	@Override
	public void healing(Base Player1) {		
	}

}
