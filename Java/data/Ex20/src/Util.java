import java.util.Scanner;

public class Util {
	public String stringCheck(String print) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(print);
		
		return scanner.next();
	}
	
	public int scoreCheck(String print) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(print);
		return scanner.nextInt();
	}
	
	public int numberCheck(String print) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(print);
		return scanner.nextInt();
	}
}
