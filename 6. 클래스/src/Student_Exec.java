import java.util.Arrays;

public class Student_Exec {
	public static void main(String[] args) {
		Student s1 = new Student("송혁중","서울시 노원구",
				"010-0000-0000",32);
		Student s2 = new Student("혁중","서울시 노원구2",
				"010-0000-0000",33);
		s1.setName("혁중");
		System.out.println(s1.getName());
		System.out.println(s1);
		s1.toString();
		System.out.println(s1);
		
		Student[] s = {new Student("송혁중","서울시 노원구",
						"010-0000-0000",32), 
					   new Student("혁중","서울시 노원구2",
						"010-0000-0000",33)};
		System.out.println(Arrays.toString(s));
		
	}
}
