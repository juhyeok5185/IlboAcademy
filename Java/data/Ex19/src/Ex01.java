import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Ex01SubDAO dao = new Ex01SubDAO();
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("1.성적등록 2.리스트 3.종료");
			System.out.println("메뉴선택 : ");
			int menuNum = scanner.nextInt();
			switch (menuNum) {
			case 1:
				Ex01Sub sub = new Ex01NewSub(); 
				System.out.println("이름 : ");
				sub.setName(scanner.next());
				System.out.println("국어 : ");
				sub.setKor(scanner.nextInt());
				System.out.println("영어 : ");
				sub.setEng(scanner.nextInt());
				System.out.println("수학 : ");
				sub.setMath(scanner.nextInt());
				System.out.println("자바 : ");
				((Ex01NewSub)sub).setJava(scanner.nextInt());
				sub.total();
				dao.setArrSubs(sub);
				break;
			case 2:
				for (Ex01Sub ex01Sub : dao.getArrSubs()) {
					System.out.println(ex01Sub.toString());
				}
				break;
			case 3:
				run = false;
				break;
			default:
				System.out.println("없는번호");
			}

		}
	}
}
