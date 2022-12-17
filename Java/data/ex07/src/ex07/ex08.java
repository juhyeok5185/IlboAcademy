package ex07;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		int cnt = 0;
		System.out.println("누적 평균값 구하기");
		out :while (true) {
			System.out.println("숫자 입력 [종료(q)]");
			if(scanner.hasNextInt()) {
				int inputNum = scanner.nextInt();
				scanner.nextLine();
				total += inputNum;
				cnt++;
			}
			else {
				if (scanner.nextLine().equals("q")) {
					break out;
				}
				else {
					System.out.println("숫자만 입력해주세요");
					scanner.nextLine();
				}
			}
		}
		System.out.printf("총합 : %d 평균 : %d / %d = %d ",total,total,cnt,total/cnt);
	}

}
