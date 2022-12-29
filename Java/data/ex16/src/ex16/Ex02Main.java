package ex16;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Ex02Main {

	public static void main(String[] args) {
		Ex02Score ex02Score = new Ex02Score();
		Ex02Score[] arrEx02Score = new Ex02Score[100];
		Scanner scanner = new Scanner(System.in);
		int cnt = 0;
		while (true) {	
			ex02Score = new Ex02Score();
			System.out.println("이름 : ");
			ex02Score.setName(scanner.next());
			System.out.println("국어 : ");
			ex02Score.setKor(scanner.nextInt());
			System.out.println("영어 : ");
			ex02Score.setEng(scanner.nextInt());
			System.out.println("수학 : ");
			ex02Score.setMath(scanner.nextInt());
			ex02Score.total();
	
			arrEx02Score[cnt] = ex02Score;
			cnt++;
			
			for (int i = 0; i < cnt; i++) {
				System.out.println(arrEx02Score[i].toString());
			}
		}
	}

}
