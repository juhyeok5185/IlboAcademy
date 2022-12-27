package ex14;

import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		Util util = new Util();
		Scanner scanner = new Scanner(System.in);
		String name = "홍길동";
		String jumin_id = "000130-1234567";
		String phone = "010-1234-1234";
		System.out.println(getData(name, 1));
		System.out.println(getData(jumin_id, 8));
		System.out.println(getData(phone, 9));
	}

	public static String getData(String a , int b) {
		String fName = a.substring(0,b);
		String starName = a.substring(b);
		starName = fName + "*".repeat(starName.length());
		return starName;
	}
	
//	public static String getData(String a , int b) {
//		
//	}
}
