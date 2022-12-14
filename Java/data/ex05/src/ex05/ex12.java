package ex05;

import java.util.Scanner;
import java.util.zip.Inflater;

public class ex12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			
			System.out.println("기사 합격 계산기");
			
			System.out.print("소프트웨어 점수 : ");
			int software = scanner.nextInt();
			System.out.print("데이터통신 : ");
			int dataNetwork = scanner.nextInt();
			System.out.print("OS : ");
			int os = scanner.nextInt();
			System.out.print("전자계산기 : ");
			int digitalC = scanner.nextInt();
			System.out.print("DB : ");
			int DB = scanner.nextInt();
			
			int total = software + dataNetwork + os + digitalC + DB;
			
			if(total >= 60 && 8 < software && 8 < dataNetwork && 8 < os && 8 < digitalC && 8 < DB) {
				System.out.println("합격");
			}
			else {
				System.out.println("불합격");
			}
			
			System.out.println("계속하시겠습니까?");
			System.out.println("1.계속 2.종료 ");
			int con = scanner.nextInt();
			if (con == 1) {
				continue;
			}
			else if (con == 2) {
				break;
			}
		}

	}

}
