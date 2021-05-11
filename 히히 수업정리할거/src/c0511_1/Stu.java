package c0511_1;

public class Stu implements Comparable<Stu>{
	
	// 이런 방식 컬렉션 프레임워크의 소트가 좋다. 
	// 얘가 더 속도가 빠르다.
	


	String name;
	int score;
	
	Stu(String name, int score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public int compareTo(Stu o) {
		if (this.score < o.score) {
			return -1;	// 앞으로
		} else if (this.score > o.score) {
			return 1;	// 뒤로
		}
		return 0;
	}
}
