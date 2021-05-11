package c0511_1;

import java.util.ArrayList;
import java.util.Collections;

public class Exec {
	
	public static void main(String[] args) {
		
		ArrayList<Stu> stuArrList = new ArrayList<Stu>();
		
		stuArrList.add(new Stu("송1", 77));
		stuArrList.add(new Stu("송2", 20));
		stuArrList.add(new Stu("송3", 100));
		stuArrList.add(new Stu("송4", 99));
		stuArrList.add(new Stu("송5", 21));
		stuArrList.add(new Stu("송6", 56));
		stuArrList.add(new Stu("송7", 33));
		stuArrList.add(new Stu("송8", 88));
		stuArrList.add(new Stu("송9", 72));
		stuArrList.add(new Stu("송10", 77));
		
		Collections.sort(stuArrList);
		
		for (int i=0; i<stuArrList.size(); i++) {
			System.out.println(stuArrList.get(i).name + " : " + stuArrList.get(i).score + "\n");
		}
	}
}
