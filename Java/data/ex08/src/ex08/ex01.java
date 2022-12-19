package ex08;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초간단 성적 계산기");
		System.out.println("이름 : ");
		String inputNameString = scanner.nextLine();
		System.out.println("국어점수 : ");
		int inputKoreanScore = scanner.nextInt();
		System.out.println("영어점수 : ");
		int inputEnglishScore = scanner.nextInt();
		System.out.println("수학점수 : ");
		int inputMathScore = scanner.nextInt();
		
		int total = inputKoreanScore + inputEnglishScore + inputMathScore;
		float avg = total / 3;
		System.out.printf("%s님\n",inputNameString);
		System.out.printf("총점 : %d 평균 : %.1f\n",total,avg);
		
	}

}
