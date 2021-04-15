package interface_1;

public class Student {
	
	String name;
	int middleScore;
	int finalScore;
	int sum = 0;
	double avg;
	int rank;
	
	Student() {
	}
	
	Student(String name) {
		this.name = name;
	}
	
	Student(String name, int mid, int fin) {
		this.name = name;
		this.middleScore = mid;
		this.finalScore = fin;
	}

	@Override
	public String toString() {
		return "\n" + name + " (중간: " + middleScore + ", 기말: " + finalScore + ")" + 
				"  총합: " + sum + "  평균: " + avg + "  등수: " + rank;
	}
}
