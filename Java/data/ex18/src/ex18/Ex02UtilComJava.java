package ex18;

public class Ex02UtilComJava extends Ex02Util {
	int java;
	int total;
	float avg;
	int react;
	char grade;
	public int getReact() {
		return react;
	}

	public void setReact(int react) {
		this.react = react;
	}

	

	public Ex02UtilComJava(String name, int kor, int eng, int math, int java, int react) {
		super(name, kor, eng, math);
		this.java = java;
		this.react = react;
		total = total();
		avg = avg();
		grade = grade();
		
		
		// TODO Auto-generated constructor stub
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}
	
	public int total() {
		return kor + eng + math  + java + react;
	}
	public void setTotal(int java) {
		total = total;
	}

	public float avg() {
		return total / 5f;
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
		return "Ex02UtilComJava [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + " java=" + java + ", react=" + react + ", total=" + total + ", avg=" + avg + ", grade=" + grade + "]";
	}

}
