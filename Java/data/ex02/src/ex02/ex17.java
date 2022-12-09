package ex02;

import java.util.Scanner;
import java.util.Iterator;
import java.util.Random;

public class ex17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		rand.nextInt(46);
		
		for (int i = 0; i < 6; i++) {
			System.out.println("숫자 : " + (rand.nextInt(46)+1));
		}
		
	}

}
