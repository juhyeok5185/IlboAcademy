
public class Ex01NewSub2 extends Ex01Sub {
	int java;
	int react;
	int total;
	float avg;
	char grade;
	
	
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
		grade();
	}

	@Override
	void avg() {
		avg = total/5;
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
		return "Ex01NewSub2 [getName()=" + getName() + ", getKor()=" + getKor() + ", getEng()=" + getEng()
				+ ", getMath()=" + getMath() + ", java=" + java + ", react=" + react + ", total=" + total + ", avg="
				+ avg + ", grade=" + grade + "]";
	}

	

	

}
