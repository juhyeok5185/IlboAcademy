
public class Score2 extends SuperScore {
	private int total;
	private float avg;
	private char grade;
	private int java;
	private int react;

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getReact() {
		return react;
	}

	public void setReact(int react) {
		this.react = react;
	}

	@Override
	void total() {
		total = getKor() + getEng() + getMath() + java + react;
		avg();
	}

	@Override
	void avg() {
		avg = total / 5;
		grade();
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
		return "Score2 [getName()=" + getName() + ", getKor()=" + getKor() + ", getEng()=" + getEng() + ", getMath()="
				+ getMath() + ", java=" + java + ", react=" + react  + ", total=" + total + ", avg=" + avg
				+ ", grade=" + grade + "]";
	}

}
