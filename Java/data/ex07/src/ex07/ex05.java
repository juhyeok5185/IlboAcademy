package ex07;

import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int min = Integer.MAX_VALUE;
		int[] player = new int[5];
		int winner = 0;
		int num = random.nextInt(100)+1;
		System.out.println("1번주자 : ");
		player[0] = scanner.nextInt();
		System.out.println("2번주자 : ");
		player[1] = scanner.nextInt();
		System.out.println("3번주자 : ");
		player[2] = scanner.nextInt();
		System.out.println("4번주자 : ");
		player[3] = scanner.nextInt();
		System.out.println("5번주자 : ");
		player[4] = scanner.nextInt();
		
		for (int i = 0; i < player.length; i++) {
			int abs = Math.abs(player[i] - num);
			if (abs < min) {
				min = abs;
				winner = player[i];
			}
		}
		
		System.out.println("숫자 : " + num);
		System.out.println("승자 : " + winner);
		
	}

}
