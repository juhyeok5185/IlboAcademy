package ex05;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("로또구매수");
		int numInput = scanner.nextInt();
		
		for (int k = 1; k <= numInput; k++) {
		
			for (int i = 1; i <= 6; i++) {
				int answer = new Random().nextInt(45) + 1;
				System.out.printf("%2d  ", answer);
				
				if (i == 6) {
					int bonus = new Random().nextInt(45) + 1;
					System.out.printf("보너스번호 %2d", bonus);
					System.out.println();
				}
			}
		}
	}

}
