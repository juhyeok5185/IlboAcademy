package ex04;

import java.util.Iterator;

public class ex13 {

	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			if(i % 2 != 0) {
				continue;
			}
			for (int j = 1; j <= 9; j++) {
					if(j==1) {
						System.out.printf("%d단%n",i);
					}
					System.out.printf("%d * %d = %d%n",i,j,i*j);
			}
		}
	}
}
