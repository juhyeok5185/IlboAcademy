package ex10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String grade = "";
		int korean = 0;
		int english = 0;
		int math = 0;
		String name = "";
		while (true) {			
			System.out.print("이름 : ");
			name = scanner.nextLine();
			if (name.contains(" ")) {
				System.out.println("띄어쓰기는 사용할수 없습니다.");
				continue;
			}else if (name.length() < 2) {
				System.out.println("2자 이상 입력해주세요");
				continue;
			}
			else {
				break;
			}
		}
		
		while (true) {
			try {
				System.out.print("국어 : ");
				korean = scanner.nextInt();
				if (korean > 100 | korean < 0) {
					System.out.println("100점이 넘으면 안됩니다.");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("숫자로 입력해주세요");
				scanner.nextLine();
			}
		}
		while (true) {
			try {
				System.out.print("영어 : ");
				english = scanner.nextInt();
				if (english > 100 | english < 0) {
					System.out.println("100점이 넘으면 안됩니다.");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("숫자로 입력해주세요");
				scanner.nextLine();
			}
		}
		while (true) {
			try {
				System.out.print("수학 : ");
				math = scanner.nextInt();
				if (math > 100 | math < 0) {
					System.out.println("100점이 넘으면 안됩니다.");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("숫자로 입력해주세요");
				scanner.nextLine();
			}
		}
		
		int total = korean + english + math;
		float avg = total / 3f;
		
		if (avg >= 90) {
			grade = "A";
		}
		else if (avg >= 80) {
			grade = "B";
		}
		else if (avg >= 70) {
			grade = "C";
		}
		else if (avg >= 60) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		System.out.println();
		System.out.println("성적리스트");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t\t학점");
		System.out.println("---------------------------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s",name,korean,english,math,total,avg,grade);	
	}
}
