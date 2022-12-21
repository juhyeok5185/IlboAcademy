package ex10;

import javax.print.attribute.standard.MediaSize.Engineering;

public class ex02 {
	public static void main(String[] args) {
		print();
		int sum = Duplication(2);
		System.out.println(sum);
		int k = sum(10,20,30);
		System.out.println(k);
	}

	public static void print() {
		int j = 1;
		System.out.println("안녕");
	}

	public static int Duplication(int m) {
		return m * 2;
	}
	public static int sum(int n , int k, int p) {
		return n + k + p;
	}
	public void name(int[] n) {
		
	}
}
