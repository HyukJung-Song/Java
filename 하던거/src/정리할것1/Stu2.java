package 정리할것1;

public class Stu2 {
	
	String name;
	int mid;
	int fin;
	int sum;
	double avg;
	int rank;
	
	public Stu2(String name) {
		this.name = name;
	}
	
	public void calc_sum_avg() {
		sum = mid + fin;
		avg = sum / 2.0;
	}
	
	@Override
	public String toString() {
		return "Stu [name=" + name + "]";
	}


	
}
