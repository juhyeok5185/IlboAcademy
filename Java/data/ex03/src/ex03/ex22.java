package ex03;

import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초간단 성적 계산기");
		System.out.println("이름 : ");
		String nameString = scanner.next();
		System.out.println("국어점수 : ");
		int koreanScore = scanner.nextInt();
		System.out.println("영어점수 : ");
		int englishScore = scanner.nextInt();
		System.out.println("수학점수 : ");
		int mathScore = scanner.nextInt();
		
		int total = koreanScore + englishScore + mathScore;
		int avg = total / 3;
		
		System.out.printf("%s님 총점 : %d, 평균 : %d 입니다 ",nameString , total, avg);
	}

}
