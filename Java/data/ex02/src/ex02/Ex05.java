package ex02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 : ");
		String nameString = scanner.next();
		System.out.println("국어점수 : ");
		int koreaScore = scanner.nextInt();
		System.out.println("영어점수 : ");
		int englishScore = scanner.nextInt();
		System.out.println("수학점수 : ");
		int mathScore = scanner.nextInt();
		
		int total = koreaScore + englishScore + mathScore;
		float rating = total / 3;
		String score = "";
		
		if (rating >= 90) {
			score = "A";
		}
		else if (rating >= 80 && rating <= 89 ) {
			score = "B";
		}
		else if (rating >= 70 && rating <= 79){
			score = "C";
		}
		else if (rating >= 60 && rating <= 69){
			score = "D";
		}
		else {
			score = "F";
		}
		
		System.out.println(nameString + "님");
		System.out.println(" 평균 : " + rating );
		System.out.println(" 학점 : " + score );
	}

}
