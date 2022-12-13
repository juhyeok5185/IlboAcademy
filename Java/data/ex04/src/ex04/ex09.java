package ex04;

import java.util.Iterator;

public class ex09 {

	public static void main(String[] args) {

		out:
		for (int i = 0; i <= 100; i++) {
			if(i % 2 != 0) {
				continue;
			}
			else if (i != 0){
				System.out.println(i);
				break out;
			}
		}
	}

}
