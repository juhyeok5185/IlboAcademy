import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreDAO {
	private List<SuperScore> arrScore = new ArrayList<>();

	public List<SuperScore> getArrScore() {
		return arrScore;
	}

	public void setArrScore(List<SuperScore> arrScore) {
		this.arrScore = arrScore;
	}

	public void insertArrScore(SuperScore superScore) {
		arrScore.add(superScore);
	}
	
	public void serchName(String serchName) {
		for (SuperScore score : arrScore) {
			if (score.getName().contains(serchName)) {
				System.out.println(score.toString());
			}
		}
	}
	public void changeScore(String serchName) {
		Scanner scanner = new Scanner(System.in);
		for (SuperScore score : arrScore) {
			if (score.getName().equals(serchName)) {
				System.out.println(score.toString());
				System.out.println("변경할과목");
				System.out.println("1.국어 2.영어 3.수학 4.자바 5.리엑트 6.종료");
				int menuNum = scanner.nextInt();
				change(menuNum, score);
				break;
			}
		}
	}
	public void change(int i, SuperScore score) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("수정할 점수 : ");
		int changeScore = scanner.nextInt();
		switch (i) {
		case 1:
			score.setKor(changeScore);
			score.total();
			System.out.println("수정완료");
			break;
		case 2:
			score.setEng(changeScore);
			score.total();
			System.out.println("수정완료");
			break;
		case 3:
			score.setMath(changeScore);
			score.total();
			System.out.println("수정완료");
			break;
		case 4:
			((Score2)score).setJava(changeScore);
			score.total();
			System.out.println("수정완료");
			break;
		case 5:
			((Score2)score).setReact(changeScore);
			score.total();
			System.out.println("수정완료");
			break;
		case 6:
			break;
		default:
			System.out.println("없는번호");
			break;
		}
	}
	public void print() {
		for (SuperScore score : arrScore) {
			System.out.println(score.toString());
		}
	}
}
