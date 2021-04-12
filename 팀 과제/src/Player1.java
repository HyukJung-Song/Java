

public abstract class Player1 extends Base {

	public abstract void attackP2(Base Player2);

	public abstract void attackP3(Base Player3);
	
	public abstract void healing(Base Player1);
	
	
	// 요거는 어차피 추상클래스가 아니라서 그냥 뒀는데 아마 다른 조꺼랑 합쳐도 괜찮을거 같아~~ (빼도 되고~~)
	// 우리 조는 힐러빼고 다 아래 메소드를 넣었거든
	// 고생이 많다.... ㅠ-ㅠ
	public void DeadOrLive(Base enemy) {
		if (!enemy.isLive()) {
			System.out.println("<< " + enemy.name + " 사망!! >>");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
}
