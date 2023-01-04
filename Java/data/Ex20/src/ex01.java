
public class ex01 {

	public static void main(String[] args) {
		ScoreDAO scoreDAO = new ScoreDAO();
		Util util = new Util();
		boolean run = true;
		
		while (run) {
			int menuNum = util.numberCheck("1.성적등록 2.리스트 3.검색 4.수정 5.종료");
			switch (menuNum) {
			case 1:
				SuperScore superScore = new Score2();
				superScore.setName(util.stringCheck("이름 : "));
				superScore.setKor(util.scoreCheck("국어 : "));
				superScore.setEng(util.scoreCheck("영어 : "));
				superScore.setMath(util.scoreCheck("수학 : "));
				((Score2)superScore).setJava(util.scoreCheck("자바 : "));
				((Score2)superScore).setReact(util.scoreCheck("리엑트 : "));
				superScore.total();
				scoreDAO.insertArrScore(superScore);
				break;
			case 2:
				scoreDAO.print();
				break;
			case 3:
				String serchName = util.stringCheck("이름검색 : ");
				scoreDAO.serchName(serchName);
				break;
			case 4:
				serchName = util.stringCheck("이름검색 : ");
				scoreDAO.changeScore(serchName);
				break;
			case 5:
				run = false;
				break;
			default:
				System.out.println("없는번호");
				break;
			}

		}
	}
}
