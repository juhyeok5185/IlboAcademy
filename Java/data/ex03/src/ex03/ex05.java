package ex03;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력 받아 60이상이면 학격 불합격 출력");
		System.out.println("점수 : ");
		int numInput = scanner.nextInt();
		System.out.println(numInput >= 60 ? "합격" : "불합격");
	}

}
