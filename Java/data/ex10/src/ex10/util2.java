package ex10;

import java.util.Iterator;
import java.util.Scanner;

public class util2 {
	
	public String name() {
		String name = "";
		Scanner sc = new Scanner(System.in);
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
		return name;
	}

	public int numberCheck(String a) {
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		while (true) {
			System.out.print(a + " : ");
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

	public int sum(int a, int b, int c) {
		return a + b + c;
	}

	public float avg(int a, float b) {
		return a / b;
	}
	
	public String gradeCul(float a) {
		String grade = "";
		float avg = a;
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
		return grade;
	}
	
	public void view(String a , int[]b ,int e, float f,String g) {
		int kor = 0;
		int eng = 0;
		int math = 0;
		for (int i =0;  i < b.length; i++) {
			if(i==0) {				
				kor = b[i];
			}
			else if (i==1) {
				eng = b[i];
			}
			else {
				math = b[i];
			}
		}
		System.out.println();
		System.out.println("성적리스트");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("-----------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s", a, kor, eng, math, e, f,g);
	}
	
	public void start() {
		util2 u = new util2();
		String name = "";// 수험자이름
		int kor = 0;// 국어점
		int eng = 0;
		int math = 0;
		String grade = "";

		name = u.name();
		kor = u.numberCheck("국어");
		eng = u.numberCheck("영어");
		math = u.numberCheck("수학");
		int[] scores = {kor,eng,math};
		int total = u.sum(kor, eng, math);
		float avg = u.avg(total, 3f);
		grade = u.gradeCul(avg);
		u.view(name, scores, total, avg, grade);
	}


}
