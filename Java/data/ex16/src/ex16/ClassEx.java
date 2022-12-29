package ex16;

public class ClassEx {
	private int a;
	private int b;
	private int kor;
	public ClassEx() {
	}
	public ClassEx(int kor) {
		this.kor=kor;
		b=200;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getKor() {
		return kor;
	}
}
