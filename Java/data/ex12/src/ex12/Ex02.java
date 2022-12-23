package ex12;
import java.util.Scanner;
public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		int cnt = 0;
		int[] total = new int[3];
		float[] avg = new float[3];
		String[] grade = new String[3];
		boolean run = true;
		
		System.out.println("성적 계산기");
		
		while (run) {
			System.out.println("1.성적등록 2.리스트 0.종료");
			System.out.print("메뉴선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {
			case 1:
				System.out.print("이름 : ");
				name[cnt] = sc.nextLine();
				System.out.print("국어점수 : ");
				kor[cnt] = sc.nextInt();
				System.out.print("영어점수 : ");
				eng[cnt] = sc.nextInt();
				System.out.print("수학점수 : ");
				math[cnt] = sc.nextInt();
				System.out.println("등록 완료");
				cnt++;
				break;
			case 2:
				System.out.print("성적리스트");
				System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
				System.out.println("-----------------------------------------------------");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s%n", name[i], kor[i], eng[i], math[i], total[i],
							avg[i], grade[i]);
				}
				break;
			case 0:
				System.out.print("프로그램 종료");
				run = false;
				break;

			default:
				System.out.println("메뉴번호를 확인해주세요.");
				break;
			}
			total[cnt] = (kor[cnt] + eng[cnt] + math[cnt]);
			avg[cnt] = (kor[cnt] + eng[cnt] + math[cnt]) / 3f;
			if (avg[cnt] >= 90) {
				grade[cnt] = "A";
			} else if (avg[cnt] >= 80) {
				grade[cnt] = "B";
			} else if (avg[cnt] >= 70) {
				grade[cnt] = "C";
			} else if (avg[cnt] >= 60) {
				grade[cnt] = "D";
			} else {
				grade[cnt] = "F";
			}
		}
	}
}
