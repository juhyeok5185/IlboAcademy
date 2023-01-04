package ex18;

public class Ex02UtilCom extends Ex02Util  {
	String name;
	int kor;
	int eng;
	int math;
	int com;
	int total;
	float avg;
	char grade;
	public void Ex02UtilCom() {
		
	}
	public Ex02UtilCom(String name, int kor, int eng, int math, int com) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
		this.total = total();
		this.avg = avg();
		this.grade = grade();
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
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}
	public int total() {
		return kor + eng + math + com;
	}

	public float avg() {
		return total / 4f;
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
		return "Ex02UtilCom [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com
				+ ", total=" + total + ", avg=" + avg + ", grade=" + grade + "]";
	}
	
}
