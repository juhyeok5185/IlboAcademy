package Project;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Util {

	public String nameCk() {
		System.out.print("이름 : ");
		String loginId = "";
		Scanner sc = new Scanner(System.in);
		while (true) {
			loginId = sc.nextLine();
			if (loginId.equals("")) {
				System.err.println("이름을 입력해 주세요");
				continue;
			}
			if (loginId.length() < 2) {
				System.err.println("이름은 2자 이상");
				continue;
			}
			break;
		}
		return loginId;
	}
	

	public int numberCheck2() {
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		while (true) {
			if (sc.hasNextInt()) {
				kor = sc.nextInt();
				sc.nextLine();
				break;
			} else {
				System.err.println("숫자만 입력해 주세요");
				sc.nextLine();
				continue;
			}
		}
		return kor;
	}

	public int numberCheck() {
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		while (true) {
			System.out.print("국어 : ");
			if (sc.hasNextInt()) {
				kor = sc.nextInt();
				sc.nextLine();
				if (kor > 100 || kor < 0) {
					System.out.println("점수 범위 초과");
					continue;
				}
				break;
			} else {
				System.out.println("숫자만 입력해 주세요");
				sc.nextLine();
				continue;
			}
		}
		return kor;
	}

	public int numberCheck(String sub) {
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		while (true) {
			System.out.print(sub + " : ");
			if (sc.hasNextInt()) {
				kor = sc.nextInt();
				sc.nextLine();
				if (kor > 100 || kor < 0) {
					System.out.println("점수 범위 초과");
					continue;
				}
				break;
			} else {
				System.out.println("숫자만 입력해 주세요");
				sc.nextLine();
				continue;
			}
		}
		return kor;
	}

	public int numberCheck1() {
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		while (true) {
			System.out.print("수학 : ");
			if (sc.hasNextInt()) {
				kor = sc.nextInt();
				sc.nextLine();
				if (kor > 100 || kor < 0) {
					System.out.println("점수 범위 초과");
					continue;
				}
				break;
			} else {
				System.out.println("숫자만 입력해 주세요");
				sc.nextLine();
				continue;
			}
		}
		return kor;
	}

	public void print(String name, int kor, int eng, int math, int total, float avg, String grade) {
		System.out.println("성적리스트");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("-----------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s", name, kor, eng, math, total, avg, grade);
	}

	public void start() {
		Scanner sc = new Scanner(System.in);
		String name = "";
		System.out.println("성적 계산기");
		while (true) {
			System.out.print("이름 : ");
			name = sc.nextLine();
			if (name.equals("")) {
				System.out.println("이름을 입력하세요");
				continue;
			}
			if (name.length() < 2) {
				System.out.println("이름은 2자 이상");
				continue;
			}
			break;
		}
		int kor = numberCheck("국어");
		int eng = numberCheck("영어");
		int math = numberCheck("수학");
//
////
		int total = kor + eng + math;
		float avg = total / 3f;
		String grade = "";

		if (avg >= 90) {
			grade = "A";
		} else if (avg >= 80) {
			grade = "B";
		} else if (avg >= 70) {
			grade = "C";
		} else if (avg >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
//		
		print(name, kor, eng, math, total, avg, grade);
	}

	void print(String name, int[] scores, int total, float avg, String grade) {
//		String[] sub= {"kor","eng","math"};
		int kor = 0;
		int eng = 0;
		int math = 0;

		for (int i = 0; i < scores.length; i++) {
			if (i == 0) {
				kor = scores[i];
			} else if (i == 1) {
				eng = scores[i];
			} else {
				math = scores[i];
			}
		}

		System.out.println("성적리스트");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("-----------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s", name, kor, eng, math, total, avg, grade);

	}

	public String todayTime() {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(today);
		return date;
	}

//	public String idCk() {
//
//		String loginId = "";
//		Scanner sc = new Scanner(System.in);
//		while (true) {
//			loginId = sc.nextLine();
//			if (.equals(loginId) {
//				System.out.println("중복된 아이디입니다.");
//				continue;
//			}
//			if (loginId.equals("")) {
//				System.out.println("아이디를 입력해 주세요");
//				continue;
//			}
//			if (loginId.length() < 4) {
//				System.out.println("아이디는 4자 이상");
//				continue;
//			}
//			break;
//		
//		// TODO Auto-generated method stub
//		return null;
//	}

}
