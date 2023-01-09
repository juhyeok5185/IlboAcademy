package Project;

public class Member {

	private String name;
	private String id;
	private String pw;
	private int point;
	private int rank;

	public Member() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Member(String name, String id, String pw, int point, int rank) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.point = point;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return name + "님\t" + point + "점\t" + rank + "위";
	}
}
