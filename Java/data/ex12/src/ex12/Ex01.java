package ex12;

import java.security.DrbgParameters.NextBytes;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] korean = new int[10];
		int[] english = new int[10];
		int[] math = new int[10];
		String[] name = new String[10];
		int[] total = new int[10];
		float[] avg = new float[10];
		String[] grade = new String[10];
		int cnt = 0;

		while (true) {
			System.out.println("1.점수등록 2.검색");
			int menuNum = scanner.nextInt();
			scanner.nextLine();

			switch (menuNum) {
			case 1:
				while (true) {
					System.out.print("이름 : ");
					name[cnt] = scanner.nextLine();
					if (name[cnt].contains(" ")) {
						System.out.println("띄어쓰기는 사용할수 없습니다.");
						continue;
					} else if (name[cnt].length() <= 2) {
						System.out.println("두자이상 입력해주세요");
						continue;
					}

					break;
				}

				while (true) {
					try {
						System.out.print("국어 : ");
						korean[cnt] = scanner.nextInt();
						if (korean[cnt] > 100 | korean[cnt] < 0) {
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
						english[cnt] = scanner.nextInt();
						if (english[cnt] > 100 | english[cnt] < 0) {
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
						math[cnt] = scanner.nextInt();
						if (math[cnt] > 100 | math[cnt] < 0) {
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
					total[i] = korean[i] + english[i] + math[i];
					avg[i] = total[i] / 3f;

					if (avg[i] >= 90) {
						grade[i] = "A";
					} else if (avg[i] >= 80) {
						grade[i] = "B";
					} else if (avg[i] >= 70) {
						grade[i] = "C";
					} else if (avg[i] >= 60) {
						grade[i] = "D";
					} else {
						grade[i] = "F";
					}
				}

				System.out.println();
				System.out.println("성적리스트");
				System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
				System.out.println("---------------------------------------------------------------");
				for (int i = 0; i < cnt + 1; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\n", name[i], korean[i], english[i], math[i],
							total[i], avg[i], grade[i]);
				}
				scanner.nextLine();
				cnt++;
				break;
			case 2:
				System.out.println("이름검색 : ");
				String serchName = scanner.next();
				boolean serchCk = false;
				for (int i = 0; i < cnt; i++) {
					if (serchName.equals(name[i])) {
						System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
						System.out.println("---------------------------------------------------------------");
						System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\n", name[i], korean[i], english[i], math[i],
								total[i], avg[i], grade[i]);
						serchCk = true;
					} 
				}
				if(serchCk == false) {
					System.out.println("등록된 이름이 없습니다.");
				}
				break;
			}

			continue;

		}
	}
}
