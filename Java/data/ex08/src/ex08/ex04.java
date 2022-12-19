package ex08;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		Date todayDate = new Date();
		String date = sdf.format(todayDate);
		int money = 0;
		
		
		String list = "";
		String statuString ="";
		out: while (true) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.예금 |2.출금 |3.잔고 |4.입출금리스트 |5.종료 ");
			System.out.println("-----------------------------------------------");
			System.out.println("메뉴 :");
			int menuNum = scanner.nextInt();
			switch (menuNum) {
			case 1:
				System.out.println("입금금액 : ");
				int deposit = scanner.nextInt();
				money += deposit;
				statuString = "입금";
				todayDate = new Date();
				list += date + "\t"+deposit +"\t"+"\t"+  statuString +"\t"+"\t"+ money+"\n" ;
				break;
			case 2:
				System.out.println("출금");
				int withdrwal = scanner.nextInt();
				money -= withdrwal;
				statuString = "출금";
				todayDate = new Date();

				list += date + "\t"+withdrwal +"\t"+"\t"+  statuString +"\t"+"\t"+ money+"\n" ;
				break;
			case 3:
				System.out.println("잔고 : " + money);
				break;
			case 4:
				System.out.println("날짜\t\t\t금액\t\t입출금\t\t잔고");
				System.out.println(list);
				break;
			case 5:
				System.out.println("종료");
				break out;
			default:
				System.out.println("없는번호");
			}

		}
	}

}
