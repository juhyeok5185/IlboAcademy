package ex04;

import java.util.Iterator;

public class ex10 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			if(i == 5) {
				continue;
			}
			System.out.println(2 * i);
		}
	}

}
