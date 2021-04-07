
public class Stu {

	String name;
	int midScore;
	int finalScore;
	int totalScore;
	
	public Stu(String name, int midScore, int finalScore) {
		this.name = name;
		this.midScore = midScore;
		this.finalScore = finalScore;
		this.sumScore();		// 이런식으로 총점 계산해서 넣을 수 있다.
	}
	
	public void sumScore() {
		this.totalScore = this.midScore + this.finalScore;
	}

	@Override
	public String toString() {
		return "이름: " + name + " / 중간고사 성적: " + midScore + 
				" / 기말고사 성적: " + finalScore + " / 총 성적: " + totalScore;
	}
	
	

	
	
	
	
	
}
