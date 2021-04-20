package abstract_1;

public class PlayerType1 extends Player {
	
	PlayerType1(){}
	
	public PlayerType1(String name) {
		this.hp = 50;
		this.power = 10;
		this.defense = 5;
		this.name = name;
	}

	@Override
	public void attack(Base enemy) {
		int damage = this.power - enemy.defense;
		enemy.hp = enemy.hp - damage;
		
		System.out.println(this.name + "은(는) " + enemy.name + 
							"에게 " + damage + "의 데미지를 입힘!");
		if (!enemy.isLive()) {
			System.out.println(enemy.name + " 사망!!");
		}
		
		
	}

}
