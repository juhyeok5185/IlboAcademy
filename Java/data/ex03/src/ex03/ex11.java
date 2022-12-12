package ex03;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Scanner;
import java.util.zip.CheckedOutputStream;

public class ex11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("음료 자판기");
		System.out.println("금액을 넣어주세요 : ");
		int moneyInput = scanner.nextInt();
		System.out.println("잔액 : " + moneyInput);
		System.out.println("1.커피(2800원) 2.사이다(1500원) 3.우유(1200원)");
		System.out.println("메뉴선택 : ");
		int selectNum = scanner.nextInt();

		String menu = "";
		int cost = 0;
		switch (selectNum) {
		case 1:
			menu = "커피";
			cost = 2800;
			break;
		case 2:
			menu = "사이다";
			cost = 1500;
			break;
		case 3:
			menu = "우유";
			cost = 1200;
			break;
		default:
			System.out.println("엄서연");
			break;
		}
		int reMoney = moneyInput - cost;
		
		if (reMoney < 0) {
			System.out.println("잔액이 부족합니다.");
		}
		else {
			System.out.println(menu + " 판매완료");
			System.out.println("잔액 : " + reMoney);
		}
	}

}
