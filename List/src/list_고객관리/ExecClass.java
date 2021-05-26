package list_고객관리;

import java.util.ArrayList;

public class ExecClass {
	public static void main(String[] args) {
		Student[] s1 = {new Student("송1", 100), new Student("송2", 80)};
		Student[] s2 = new Student[3];
		s2[0] = new Student("혁1", 90);
		s2[1] = new Student("혁2", 50);
		
		
		// Generic : ArrayList의 <타입>
		ArrayList<Student> s3 = new ArrayList<Student>();
		s3.add(new Student("중1", 1000));
		s3.add(new Student("중2", 2000));

		System.out.println(s3.get(0));	// s2[0]같은 느낌, list_1.Student@3830f1c0
		System.out.println(s3.get(0).name);		// 중1
		
		for (int i=0; i<s3.size(); i++) {
			System.out.println(s3.get(i).name + "의 중간고사 점수 : " + s3.get(i).middleScore);
		}
	}
}
