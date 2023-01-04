package ex18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Ex02Util> arrUtil = new ArrayList<>();
		boolean run = true;
		while (run) {
			System.out.println("1.성적등록 2.리스트 3.종료");
			int menuNum = scanner.nextInt();
			scanner.nextLine();
			switch (menuNum) {
			case 1:
				System.out.println("이름 : ");
				String name = scanner.nextLine();
				System.out.println("국어 : ");
				int kor = scanner.nextInt();
				System.out.println("영어 : ");
				int eng = scanner.nextInt();
				System.out.println("수학 : ");
				int math = scanner.nextInt();
				Ex02Util ex02Util = new Ex02Util(name,kor,eng,math);
				arrUtil.add(ex02Util);
				break;
			case 2:
				for (Ex02Util ex02 : arrUtil) {
					System.out.println(ex02.toString());
				}
				break;
			case 3:
				run = false;
				break;
			default:
				System.out.println("없는번호");
				break;
			}
		}
	}

}
