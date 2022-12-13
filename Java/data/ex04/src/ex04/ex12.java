package ex04;

import java.util.Iterator;
import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 단 입력 : ");
		int firstDan = scanner.nextInt();
		System.out.print("두번째 단 입력 : ");
		int secDan = scanner.nextInt();
		System.out.printf("%d단           %d단%n",firstDan,secDan);
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %2d    %d * %d = %2d%n",firstDan,i,firstDan*i,secDan,i,secDan * i);
		}
	}

}
