package abstract_1;

public class EnemyType1 extends Enemy {
	
	public EnemyType1(String name) {
		this.hp = 30;
		this.power = 5;
		this.defense = 5;
		this.name = name;
	}

	@Override
	public void attack(Base player) {
		int damage = this.power - player.defense;
		player.hp = player.hp - damage;
		System.out.println(this.name + " -> " + player.name);
		System.out.println("[ " + player.name + "의 남은 hp: " + player.hp + " ]");
		
		if (!player.isLive()) {
			System.out.println(player.name + " 사망..");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
