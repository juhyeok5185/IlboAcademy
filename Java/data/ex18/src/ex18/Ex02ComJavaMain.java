package ex18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02ComJavaMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Ex02Util> arrBasicUtil = new ArrayList<>();

		boolean run = true;
		while (run) {
			System.out.println("1.성적등록 2.리스트 3.종료");
			int menuNum = scanner.nextInt();
			scanner.nextLine();
			switch (menuNum) {
			case 1:
				System.out.println("1.기본 2.컴퓨터 3.자바 4.종료");
				menuNum = scanner.nextInt();
				scanner.nextLine();
				System.out.println("이름 : ");
				String name = scanner.nextLine();
				System.out.println("국어 : ");
				int kor = scanner.nextInt();
				System.out.println("영어 : ");
				int eng = scanner.nextInt();
				System.out.println("수학 : ");
				int math = scanner.nextInt();
				switch (menuNum) {
				case 1:
					Ex02Util ex02Util = new Ex02Util(name, kor, eng, math);
					arrBasicUtil.add(ex02Util);
					break;
				case 2:
					System.out.println("컴퓨터 : ");
					int com = scanner.nextInt();
					Ex02Util ex02Util2 = new Ex02UtilCom(name, kor, eng, math, com);
					arrBasicUtil.add(ex02Util2);
					break;
				case 3:
					System.out.println("자바 : ");
					int java = scanner.nextInt();
					System.out.println("리엑트 : ");
					int react = scanner.nextInt();
					Ex02Util ex02JavaUtil = new Ex02UtilComJava(name, kor, eng, math, java, react);
					arrBasicUtil.add(ex02JavaUtil);
					break;
				case 4:
					run = false;
					break;
				default:
					System.out.println("없는번호");
					break;

				}
				break;
			case 2:
				System.out.println("1.기본 2.컴퓨터 3.자바 4.종료");
				menuNum = scanner.nextInt();
				scanner.nextLine();
				switch (menuNum) {
				case 1:
					for (Ex02Util ex02util : arrBasicUtil) {
							if(ex02util instanceof Ex02Util) {								
								System.out.println(ex02util.toString());
							}
					}
					break;
				case 2:
					for (Ex02Util ex02Util : arrBasicUtil) {
						if(ex02Util instanceof Ex02UtilCom) {							
							System.out.println(((Ex02UtilCom)ex02Util).toString());
						}
					}
					break;
				case 3:
					for (Ex02Util ex02Util : arrBasicUtil) {
						if(ex02Util instanceof Ex02UtilComJava) {
							System.out.println(((Ex02UtilComJava)ex02Util).toString());
						}
					}
					break;
				case 4:
					break;
				default:
					System.out.println("없는번호");
					break;
				}
				
				break;
			case 3:
				run = false;
				break;
			default:
				System.out.println("없는번호");
				break;
			}
		}
	}

}
