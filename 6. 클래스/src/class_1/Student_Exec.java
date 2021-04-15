package class_1;

public class Student_Exec {
	public static void main(String[] args) {
		Student song = new Student();
		song.name = "송혁중";
		song.korScore = 90;
		song.engScore = 100;
		song.mathScore = 100;
		
		Student kim = new Student();
		kim.name = "김혁중";
		kim.korScore = 80;
		kim.engScore = 70;
		kim.mathScore = 40;
		
		song.printInfo();
		
		Student park = new Student("박혁중", 80, 80, 80);
		park.printInfo();
		
	// static은 늘 고정되서 비서맹키로 Class 옆에 늘 따라다니게 되는 것.
	// 그래서 메모리 사용량이 커진다.
	// 비서니까 Class.method의 형태로 쓸 수 있다.
		
		

	}
}
