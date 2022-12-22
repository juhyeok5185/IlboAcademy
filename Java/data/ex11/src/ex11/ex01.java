package ex11;

public class ex01 {

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3 };
		int[] b1 = a1;
		System.out.println();
		change(a1);
		System.out.println(b1[0]);
	}

	public static void change(int pw) {
		pw = 20;
	}

	public static void change(int[] pw) {
		pw[0] = 20;
	}
}
