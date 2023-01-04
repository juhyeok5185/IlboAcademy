
public class Score extends SuperScore {
	private int total;
	private float avg;
	private char grade;
	@Override
	void total() {
		total = getKor() + getEng() + getMath();
		avg();
	}

	@Override
	void avg() {
		avg = total/3;
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
		return "Score [getName()=" + getName() + ", getKor()=" + getKor() + ", getEng()=" + getEng() + ", getMath()="
				+ getMath() + ", total=" + total + ", avg=" + avg + ", grade=" + grade + "]";
	}
	

}
