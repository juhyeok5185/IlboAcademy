package ex02;
import java.security.PublicKey;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ex19 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.println("입금하세요 :");
		int money = scanner.nextInt();
		ex19 e19 = new ex19();
		
		for (int i = 0; i < i+1 ; i++) {
			System.out.println("잔액 : " + money);
			System.out.println("룰렛이 돌아가는 중입니다");
			int roulette = random.nextInt(1);
			System.out.println("성공시 잔액 두배 // 실패시 잔액 /2");
			System.out.println("0.홀 1.짝");
			int playerNum = scanner.nextInt();
			
			if(roulette == playerNum) {
				System.out.println("승리");
				money *= 2;
			}
			else if (roulette != playerNum) {
				System.out.println("패배");
				money /= 2;
			}
			System.out.println("남은 금액은 : " + money);
			System.out.println("계속 하시겠습니까?");
			System.out.println("1.계속 2.그만");
			int con = scanner.nextInt();
			if (con == 1) {
				i++;
			}
			else if (con == 2) {
				System.out.println("이용해주셔서 감사합니다");
				break;
			}
		}
	}
}
