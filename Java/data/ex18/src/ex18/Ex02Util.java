package ex18;

public class Ex02Util {
	String name;
	int kor;
	int eng;
	int math;
	int total;
	float avg;
	char grade;

	public Ex02Util() {
	}

	public Ex02Util(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = total();
		avg = avg();
		grade = grade();
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

	public int total() {
		return kor + eng + math;
	}

	public float avg() {
		return total / 3f;
	}

	public char grade() {
		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 80) {
			grade = 'B';
		} else if (avg >= 70) {
			grade = 'C';
		} else if (avg >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		return grade;
	}
	

	@Override
	public String toString() {
		return "Ex02Util [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + total
				+ ", avg=" + avg + ", grade=" + grade + "]";
	}

	
}
