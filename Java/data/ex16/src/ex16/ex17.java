package ex16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.ListCellRenderer;

public class ex17 {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		List<ex18> exList = new ArrayList<>();
		List<String> strList = new ArrayList<>(); 
		//int형
		for(int i = 0; i < 10; i++) {			
			intList.add(i);
			System.out.println(intList.get(i));
		}
		
		//foreach로 변경
		for (Integer i : intList) {
			System.out.println(i);
		}
		
		for (String string : strList) {
			System.out.println();
		}
		
//		//객체형
		for (int i = 0; i < 10; i++) {
			ex18 ex = new ex18();
			ex.a = i;
			exList.add(ex);
			System.out.println(exList.get(i).a);
		}
		

		
		
	}

}
