package fishgame;

import java.util.ArrayList;
import java.util.Scanner;

public class Util {

	public int numcheck() {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		while (true) {
			if (sc.hasNextInt()) {
				a = sc.nextInt();
				sc.nextLine();
				break;
			} else {
				System.out.println("숫자만 입력");
				sc.nextLine();
			}
		}
		return a;
	}

	public int moneycheck(int money, int price) {
		int value = 0;
		if (money < price) {
			System.out.println("보유 금액이 부족합니다.");
		} else {
			value = money - price;
		}
		return value;
	}

	// 물고기 이름,물고기 사이즈
	public int fishprice(String name, int fishSize) {
		int fishPrice = 0;
		int originprice = 0;
		if (name.equals("고래상어")) {
			originprice = 1000000;
		} else if (name.equals("참돔")) {
			originprice = 50000;
		} else if (name.equals("바다장어")) {
			originprice = 20000;
		} else if (name.equals("삼치")) {
			originprice = 5000;
		} else if (name.equals("고등어")) {
			originprice = 3000;
		} else if (name.equals("멸치")) {
			originprice = 200;
		}

		if (fishSize == 1) {
			fishPrice = ((originprice * 10) / 10);
		} else if (fishSize == 2) {
			fishPrice = ((originprice * 12) / 10);
		} else if (fishSize == 3) {
			fishPrice = ((originprice * 15) / 10);
		} else if (fishSize == 4) {
			fishPrice = ((originprice * 18) / 10);
		} else if (fishSize == 5) {
			fishPrice = ((originprice * 20) / 10);

		}
		
		if (name.equals("고래상어")) {
			originprice = 1300;
			fishPrice = originprice;
		}
		
		return fishPrice;
	}

	// 물고기 이름,물고기 사이즈
	public int fishsize(String name, int fishSize) {

		int fishActualSize = 0;
		int plus = 0;
		int originsize = 0;
		if (name.equals("고래상어")) {
			originsize = 1300;
		} else if (name.equals("참돔")) {
			originsize = 50;
			plus = 10;
		} else if (name.equals("바다장어")) {
			originsize = 90;
			plus = 8;
		} else if (name.equals("삼치")) {
			originsize = 70;
			plus = 6;
		} else if (name.equals("고등어")) {
			originsize = 30;
			plus = 4;
		} else if (name.equals("멸치")) {
			originsize = 8;
			plus = 1;
		}

		if (fishSize == 1) {
			fishActualSize = originsize + ((plus * fishSize));
		} else if (fishSize == 2) {
			fishActualSize = originsize + ((plus * fishSize));
		} else if (fishSize == 3) {
			fishActualSize = originsize + ((plus * fishSize));
		} else if (fishSize == 4) {
			fishActualSize = originsize + ((plus * fishSize));
		} else if (fishSize == 5) {
			fishActualSize = originsize + ((plus * fishSize));
		}
		if (name.equals("고래상어")) {
			originsize = 1300;
			fishActualSize = originsize;
		}
		return fishActualSize;
	}

	public void getFishView(String fishName, int fishSize) {
		String getFish = "";
		String ruler = "";
		String sizeView = "";
		System.out.printf("오! ! ! %s(이)다 !%n", fishName);
		int sizeCal = 0;// 메서드 호출해서 받아올 값 ;
		if (fishName == "고래상어") {
			sizeCal = 1300;
		}else {
			sizeCal = fishsize(fishName, fishSize);
		}
		System.out.printf("%dcm %s를(을) 획득했다! !%n", sizeCal, fishName);
		System.out.println(
				"-----------------------------------------------------------------------------------------------");
		if (fishName.equals("참돔")) {
			sizeView = "】】】】】】】】";
			getFish = "<'】】】" + sizeView.repeat(fishSize) + "】】】<";
			ruler = "┌─┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯───┯───┯───┐\n│ 42 44 46 48 50 52 54 56 58 59 60 62 64 66 68 70 72 74 76 78 80 82 84 86 88 90 92 94 96 98 100 102 104 │";
		} else if (fishName.equals("바다장어")) {
			sizeView = "～. ～. ～. ～. ";
			getFish = "<')～. ～. " + sizeView.repeat(fishSize) + "～.<";
			ruler = "┌─┯───┯───┯───┯───┯───┯───┯───┯───┯───┯───┯───┯───┯───┯───┯───┯───┯───┯───┯───┯───┯───┯───┯───┯───┯───┯──┐\n│ 84  86  88  90  92  94  96  98 100 102 104 106 108 110 112 114 116 118 120 122 124 126 128 130 132 134 │";
		} else if (fishName.equals("삼치")) {
			sizeView = "〕〕〕〕 ";
			getFish = "<')〕〕" + sizeView.repeat(fishSize) + "〕〕〕 <";
			ruler = "┌─┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯───┯───┯───┯───┯───┯──┐\n│ 62 64 66 68 70 72 74 76 78 80 82 84 86 88 90 92 94 96 98 100 102 104 106 108 │";
		} else if (fishName.equals("고등어")) {
			sizeView = ") ) ) ";
			getFish = "<') ) " + sizeView.repeat(fishSize) + ") ) <";
			ruler = "┌─┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┯──┐\n│ 24 26 28 30 32 34 36 38 40 42 44 46 48 50 52 54 │";
		} else if (fishName.equals("멸치")) {
			sizeView = " 〓";
			getFish = "<')" + sizeView.repeat(fishSize) + " 〓<";
			ruler = "┌─┯──┯──┯──┯──┯──┯──┯──┯──┯──┐\n│ 7  8  9  10 11 12 13 14 15 │";
		} else if (fishName.equals("고래상어")) {
			getFish = "  ___________/\\_________\n /                      \\_/|\n(  *                     _ |\n \\___________  _________/ \\|\n	  *  \\/   *";
			ruler = "   *   \\ㅇ/    \\ㅇ/    \\ㅇ/  *\n     *  ㅣ      ㅣ      ㅣ  *\n	ㅅ      ㅅ      ㅅ";
		}
		System.out.println(getFish);
		System.out.println(ruler);

		System.out.println(
				"-----------------------------------------------------------------------------------------------");
	}

}
