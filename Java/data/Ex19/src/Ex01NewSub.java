
public class Ex01NewSub extends Ex01Sub {
	private int java;
	private int total;
	private float avg;
	private char grade;

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	@Override
	void total() {
		total = getKor() + getEng() + getMath() + java;
		avg();
		grade();
	}

	@Override
	void avg() {
		avg = total / 4f;
	}

	@Override
	void grade() {

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

	}

	@Override
	public String toString() {
		return "Ex01NewSub getName()=" + getName() + ", getKor()=" + getKor() + ", getEng()=" + getEng()
				+ ", getMath()=" + getMath() + ", java=" + java + ", total=" + total + ", avg=" + avg + ", grade="
				+ grade + "]";
	}

}
