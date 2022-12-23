package ex12;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member[] memberArr = new Member[10];
		int cnt = 0;

		while (true) {
			System.out.println("1.점수등록 2.검색");
			int menuNum = scanner.nextInt();
			scanner.nextLine();
			

			switch (menuNum) {
			case 1:
				Member member = new Member();
				while (true) {
					System.out.print("이름 : ");
					member.name = scanner.nextLine();
					if (member.name.contains(" ")) {
						System.out.println("띄어쓰기는 사용할수 없습니다.");
						continue;
					} else if (member.name.length() <= 2) {
						System.out.println("두자이상 입력해주세요");
						continue;
					}

					break;
				}

				while (true) {
					try {
						System.out.print("국어 : ");
						member.korean = scanner.nextInt();
						if (member.korean > 100 | member.korean < 0) {
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
						member.english = scanner.nextInt();
						if (member.english > 100 | member.english < 0) {
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
						member.math = scanner.nextInt();
						if (member.math > 100 | member.math < 0) {
							System.out.println("100점이 넘으면 안됩니다.");
							continue;
						}
						break;
					} catch (InputMismatchException e) {
						System.out.println("숫자로 입력해주세요");
						scanner.nextLine();
					}
				}
				for (int i = 0; i < cnt + 1; i++) {
					member.total = member.korean + member.english + member.math;
					member.avg = member.total / 3f;

					if (member.avg >= 90) {
						member.grade = "A";
					} else if (member.avg >= 80) {
						member.grade = "B";
					} else if (member.avg >= 70) {
						member.grade = "C";
					} else if (member.avg >= 60) {
						member.grade = "D";
					} else {
						member.grade = "F";
					}
				}
				System.out.println();
				System.out.println("성적리스트");
				System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
				System.out.println("---------------------------------------------------------------");
				memberArr[cnt] = member;
				for (int i = 0; i < cnt + 1; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\n", memberArr[i].name, memberArr[i].korean,
							memberArr[i].english, memberArr[i].math, memberArr[i].total, memberArr[i].avg,
							memberArr[i].grade);
				}
				scanner.nextLine();
				cnt++;
				break;
			case 2:
				System.out.println("이름검색 : ");
				String serchName = scanner.next();
				boolean serchCk = false;
				for (int i = 0; i < cnt; i++) {
					if (serchName.equals(memberArr[i].name)) {
						System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
						System.out.println("---------------------------------------------------------------");
						System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\n", memberArr[i].name, memberArr[i].korean,
								memberArr[i].english, memberArr[i].math, memberArr[i].total, memberArr[i].avg,
								memberArr[i].grade);
						serchCk = true;
					}
				}
				if (serchCk == false) {
					System.out.println("등록된 이름이 없습니다.");
				}
				break;
			}

			continue;

		}

	}

}
