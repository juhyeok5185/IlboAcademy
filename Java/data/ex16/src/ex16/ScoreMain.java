package ex16;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {
		Score score = new Score();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = scanner.next();
		score.setName(name);
		System.out.println("국어 : ");
		int kor = scanner.nextInt();
		score.setKor(kor);
		System.out.println("영어 : ");
		int eng = scanner.nextInt();
		score.setEng(eng);
		System.out.println("수학 : ");
		int math = scanner.nextInt();
		score.setMath(math);
		System.out.println(score.toString());
		System.out.printf("%s %d %d %d",score.getName(),score.getKor(),score.getEng(),score.getMath());
	}

}
