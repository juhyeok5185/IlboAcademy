package ex09;

import java.util.Iterator;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class ex06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		System.out.print("과목수를 입력하세요 : ");
		int subEa = scanner.nextInt();
		scanner.nextLine();
		String[] strArr = new String[subEa];
		int[] intArr = new int[subEa];
		int total = 0;
		
		System.out.print("학생이름 : ");
		name = scanner.next();
		for(int i = 0; i < intArr.length; i++) {
			System.out.print("과목이름 : ");
			strArr[i] = scanner.next();
			System.out.print(strArr[i] + " 점수 : " );
			intArr[i] = scanner.nextInt();scanner.nextLine();
		}
		System.out.println("-------------------------------------");
		System.out.println(name + "성적");
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(strArr[i] + "점수 : " + intArr[i] + "점");
			total += intArr[i];
		}
		System.out.println("총합 : " + total + " 평균 : " + (float)total/subEa);
	}

}
