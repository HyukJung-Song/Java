package 정리할것;

public class Stu {
	
	String name;
	int mid;
	int fin;
	int sum;
	double avg;
	
	public Stu(String name) {
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
