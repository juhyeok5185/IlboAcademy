package ex01;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("성적계산기");
		System.out.println("이름 : ");
		String nameString = scanner.next();
		System.out.println("국어점수 : ");
		int koreanScore = scanner.nextInt();
		System.out.println("영어점수 : ");
		int englishScore = scanner.nextInt();
		System.out.println("수학점수 : ");
		int mathScore = scanner.nextInt();
		
		int totalScore = koreanScore + englishScore + mathScore;
		float avg = totalScore / 3;
		
		System.out.println(nameString + "님");
		System.out.println("총점 : " + totalScore + " 평균 : " + avg);
	}

}
