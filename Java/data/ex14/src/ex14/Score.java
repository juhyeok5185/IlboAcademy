package ex14;

import java.util.Scanner;

public class Score {
	String name;
	int kor;
	int eng;
	int math;
	int total;
	float avg;
	String score;

	public int sum(int kor, int eng, int math) {
		return kor + eng + math;
	}

	public float avg(int i, float f) {
		// TODO Auto-generated method stub
		return i / f;
	}

	public String grade(float avg) {
		String score = "";
		if (avg >= 90) {
			score = "A";
		} else if (avg >= 80) {
			score = "B";
		} else if (avg >= 70) {
			score = "C";
		} else if (avg >= 60) {
			score = "D";
		} else {
			score = "F";
		}
		return score;
	}

	public int Cul(String string) {
		System.out.println(string);
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		return num;
	}

	public int print(int a, int b, int c) {
		int num = 0;
		switch (c) {
		case 1:
			System.out.println("더하기");
			num = a + b;
			break;
		case 2:
			System.out.println("뺴기");
			num = a - b;
			break;
		case 3:
			System.out.println("곱하기");
			num = a * b;
			break;
		case 4:
			System.out.println("나누기");
			num = a / b;
			break;

		}
		return num;
	}

	public int InputScore(String string) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		while (true) {
			System.out.println(string);
			num = scanner.nextInt();
			scanner.nextLine();
			if(scanner.hasNextInt()) {				
				if (num < 0) {
					System.out.println("0보다 작음");
					continue;
				}
				else if (num > 100) {
					System.out.println("100보다 큼");
					continue;
				}
				break;
			}
			else {
				System.out.println("숫자만 입력");
			}
		}
		return num;
	}

	public String InputName(String string) {
		Scanner scanner = new Scanner(System.in);
		String str = "";
		while (true) {
			System.out.println(string);
			str = scanner.nextLine();
			if (str.contains(" ")) {
				System.out.println("띄어쓰기 금지");
				continue;
			} else if (str.length() < 3) {
				System.out.println("2글자 이상");
				continue;
			} else {
				break;
			}
		}
		return str;
	}

}
