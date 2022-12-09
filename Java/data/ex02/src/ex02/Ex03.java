package ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 : ");
		String nameString = scanner.next();
		
		System.out.println("안녕하세요. 반갑습니다 \n저는" + nameString + "입니다. \n잘 부탁드립니다.");
	}

}
