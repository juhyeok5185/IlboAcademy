package ex16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();

		while (true) {
			try {
				System.out.println("숫자만 입력가능합니다 끝내시려면(q)");
				int num = scanner.nextInt();
				list.add(num);
			} catch (Exception e) {
				String a = scanner.nextLine();
				if (a.equals("q")) {
					break;
				}
				System.out.println("숫자만 입력하세요");
			}
		}
		int total = 0;
		for (Integer i : list) {
			total += i;
		}
		System.out.println(total);
	}

}
