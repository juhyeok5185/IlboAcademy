package ex02;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("출생년도");
		String s = "";
		int bYear = scanner.nextInt();
		int nYear = 2022;
		String adult = "성인";
		String student = "학생";
		
//		if (nYear - bYear <= 20) {
//			s = "학생";
//		}
//		else if(age >= 14 && age <= 19) {
//			s = "청소년";
//		}
//		else {
//			s = "아동"
//		}
		
		String compare = nYear - bYear <= 20 ? s = student : adult ;
		System.out.println(compare);
		
	}

}
