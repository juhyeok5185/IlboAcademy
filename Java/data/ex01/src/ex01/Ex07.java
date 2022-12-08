package ex01;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("성적계산기");
		System.out.println("이름 : ");
		String numString = scanner.next();
		System.out.println("국어점수 : ");		
		int numKorean = scanner.nextInt();
		System.out.println("영어점수 : ");
		int numEnglish = scanner.nextInt();
		System.out.println("수학점수 : ");
		int numMath = scanner.nextInt();
		
		int total = numKorean + numEnglish + numMath;
		float ave = total / 3;
		
		System.out.println(numString + "님");
		System.out.println("총점 :" + total +  " 평균 :" + ave);
	}

}
