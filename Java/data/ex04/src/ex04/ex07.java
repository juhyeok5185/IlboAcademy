package ex04;


public class ex07 {

	public static void main(String[] args) {
		int answer = 0;
		for (int i = 1; i <= 15; i++) {
			if (i % 3 == 0) {
				answer += i;
			}
		}

		System.out.println(answer);
	}
}
