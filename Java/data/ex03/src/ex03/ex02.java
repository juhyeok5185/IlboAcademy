package ex03;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("성적 계산기");
		System.out.println("이름점수 : ");
		String nameInput = scanner.next();
		System.out.println("국어점수 : ");
		int koreanInput = scanner.nextInt();
		System.out.println("영어점수 : ");
		int englishInput = scanner.nextInt();
		System.out.println("수학점수 : ");
		int mathInput = scanner.nextInt();
		
		int total = koreanInput + englishInput + mathInput;
		int avg = total / 3;
		
		System.out.println(nameInput + "님");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		
		
		
	}

}
