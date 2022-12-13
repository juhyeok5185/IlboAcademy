package ex04;

import java.util.Iterator;
import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번쨰 단 입력");
		int firstDan = scanner.nextInt();
		System.out.println("두번쨰 단 입력");
		int secDan = scanner.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			for (int j = firstDan; j <= secDan; j++) {
					System.out.printf("%d * %d = %d\t",j,i,i*j);
			}
			System.out.println();
		}
	}

}
