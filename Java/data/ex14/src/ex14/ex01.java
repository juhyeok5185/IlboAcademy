package ex14;

import java.util.Iterator;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		int cnt = 0;
		Score[] arrScores = new Score[10];
		while (run) {
			System.out.println("1.성적등록 2.리스트 3.종료");
			System.out.println("메뉴선택 : ");
			int menuNum = scanner.nextInt();
			switch (menuNum) {
			case 1:
				Score sc = new Score();
				sc.name = sc.InputName("이름 : ");
				sc.kor = sc.InputScore("국어 : ");
				sc.eng = sc.InputScore("영어 : ");
				sc.math = sc.InputScore("수학 : ");
				System.out.println("등록완료");
				sc.total = sc.sum(sc.kor, sc.eng, sc.math);
				sc.avg = sc.avg(sc.total,3f);
				sc.score = sc.grade(sc.avg);
				arrScores[cnt] = sc;
				cnt++;
				break;
			case 2:
				System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
				System.out.println("------------------------------------------------------------");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%2f\t%s\t\n", arrScores[i].name, arrScores[i].kor, arrScores[i].eng, arrScores[i].math, arrScores[i].total,
							arrScores[i].avg, arrScores[i].score);
				}
				break;
			case 3:
				run = false;
				break;
			default:
				break;
			}
		}
	}

}
