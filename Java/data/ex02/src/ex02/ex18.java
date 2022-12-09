package ex02;
import java.util.Random;
import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int num = random.nextInt(2);
		
		System.out.println("1. 홀  2. 짝");
		int num2 = scanner.nextInt();
		if (num == num2) {
			System.out.println("승리");
		}
		else {
			System.out.println("패배");
		}
		
	}

}
