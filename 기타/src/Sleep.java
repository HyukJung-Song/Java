

public class Sleep {
	public static void main(String[] args) {
		
		int i = 1;
		while (true) {
			System.out.println("number" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
	}
	
}
