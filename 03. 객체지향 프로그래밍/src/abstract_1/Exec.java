package abstract_1;

public class Exec {
	
	public static void main(String[] args) {
		
		// Base > Player(추상) > PlayerType1
		Base b = new Base();
		PlayerType1 p1 = new PlayerType1();
		
		
		// 다형성
		Base p2 = new PlayerType1();
				
		
		// 추상클래스는 객체를 만들 수 없다.
		// Player p3 = new Player();
				
		
		// 하지만 가능은 하다. (임시로, 외국에서는 이렇게 많이 쓴다.)
		Player p3 = new Player() {

			@Override
			public void attack(Base enemy) {
				// TODO Auto-generated method stub
			}};
	}
}
