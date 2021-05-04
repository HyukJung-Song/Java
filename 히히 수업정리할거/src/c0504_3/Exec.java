package c0504_3;

import java.util.ArrayList;

public class Exec {
	public static void main(String[] args) {
		
		// list, map, queue
		
		/*
		 Arraylist
		 자료형(Generics)은 객체형 데이터만 쓸 수 있다.
		*/
		
		ArrayList<String> arr = new ArrayList<String>();	// int[] -> []int 맹키로
		
		ArrayList<CustomClass> arrCustom = new ArrayList<CustomClass>();
		CustomClass cus1 = new CustomClass();
		arrCustom.add(cus1);
		arrCustom.add(new CustomClass());
		
		
	}
}
