

public class Base {
	int hp;
	int power;
	int defense;
	String name;
	int mp;
	int intel;	// 법사 때문에 넣었는데.. 괜찮겠지??
	
	public boolean isLive() {
		if (this.hp < 1) {
			return false;
		}
		return true;
	}
	
	
}
