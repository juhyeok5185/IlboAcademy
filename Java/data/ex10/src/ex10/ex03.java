package ex10;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Util util = new Util();
		util.print();
		System.out.println(util.duplication(5));
		System.out.println(util.strPrint());
		util.gugudan(scanner.nextInt());
	}
}
