
package ex02;

import java.awt.Window;
import java.security.PublicKey;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class game_method {
	static Random random = new Random();
	static Scanner scanner = new Scanner(System.in);
	static game_method gMethod = new game_method();
	static int money = 0;

	public static void main(String[] args) {

		System.out.println("입금하세요 :");
		money = scanner.nextInt();
		gMethod.startSolution();
	}

	public void startSolution() {
		for (int i = 0; i < i + 1; i++) {
			System.out.println("잔액 : " + money);
			int roulette = random.nextInt(2);
			System.out.println("성공시 " + money * 2);
			System.out.println("실패시 " + money / 2);
			System.out.println("0.홀 1.짝");
			int playerNum = scanner.nextInt();

			gMethod.gameSolution(roulette, playerNum);

			System.out.println("남은 금액은 : " + money);
			System.out.println("계속 하시겠습니까?");
			System.out.println("1.계속 2.그만");
			int con = scanner.nextInt();

			if (con == 1) {
				i++;
			} else if (con == 2) {
				System.out.println("이용해주셔서 감사합니다");
				break;
			}
		}
	}

	public void gameSolution(int roulette, int playerNum) {

		if (roulette == playerNum) {
			System.out.println("승리");
			money *= 2;
		} else if (roulette != playerNum) {
			System.out.println("패배");
			money /= 2;
		}
	}
}
