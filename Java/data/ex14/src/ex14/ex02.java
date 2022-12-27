package ex14;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초간단 계산기 만들기");
		Score score = new Score();
		boolean run = true;
		int firstNum = 0;
		int secNum = 0;
		int cul = 0;
		while (run) {
			System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.종료");
			int menuNum = scanner.nextInt();
			firstNum = score.Cul("첫번째숫자");
			secNum = score.Cul("두번째숫자");
			switch (menuNum) {
			case 1:
				cul = score.print(firstNum, secNum ,menuNum);
				break;
			case 2:
				cul = score.print(firstNum, secNum ,menuNum);
				break;
			case 3:
				cul = score.print(firstNum, secNum ,menuNum);
				break;
			case 4:
				cul = score.print(firstNum, secNum ,menuNum);
				break;
			case 5:
				cul = score.print(firstNum, secNum ,menuNum);
				break;
			default:
				System.out.println("없는번호");
				break;
			}
		}
	}

}
