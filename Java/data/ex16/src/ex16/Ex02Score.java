package ex16;

public class Ex02Score {

	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private float avg;
	private char grade;

	public Ex02Score() {
	}

	public Ex02Score(String name, int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void total() {
		total = kor + eng + math;
		avg();
		grade();
	}

	public void avg() {
		avg = total / 3;
	}

	public void grade() {
		if (avg >= 90) {
			this.grade = 'a';
		} else if (avg >= 80) {
			this.grade = 'b';
		} else if (avg >= 70) {
			this.grade = 'c';
		} else if (avg >= 60) {
			this.grade = 'd';
		} else {
			this.grade = 'f';
		}
	}

	@Override
	public String toString() {
		return "Ex02Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + total
				+ ", avg=" + avg + ", grade=" + grade + "]";
	}

}
